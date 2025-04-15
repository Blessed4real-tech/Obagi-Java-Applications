function roundToInteger(number) {
    return Math.floor(number + 0.5);
}

function roundingNumbers() {
    while (true) {
        let input = prompt("Enter number (quit to exit):");
        if (input.toLowerCase() === "quit") break;
        let number = parseFloat(input);
        if (isNaN(number)) {
            console.log("Invalid input.");
            continue;
        }
        console.log(`Original: ${number}, Rounded: ${roundToInteger(number)}`);
    }
}

// roundingNumbers();