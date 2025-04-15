function calculateCharges(hours) {
    if (hours <= 3) return 2.00;
    let extraHours = Math.ceil(hours - 3);
    return Math.min(2.00 + extraHours * 0.50, 10.00);
}

function parkingGarage() {
    let totalReceipts = 0.0;
    while (true) {
        let hours = parseFloat(prompt("Enter hours parked (-1 to quit):"));
        if (hours === -1) break;
        if (isNaN(hours) || hours < 0) {
            console.log("Invalid input.");
            continue;
        }
        let charge = calculateCharges(hours);
        totalReceipts += charge;
        console.log(`Charge: $${charge.toFixed(2)}`);
        console.log(`Total Receipts: $${totalReceipts.toFixed(2)}`);
    }
}

// Simulate inputs: 2, 4.5, 10, -1
// parkingGarage();