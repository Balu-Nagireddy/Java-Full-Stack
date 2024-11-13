function isPalindrome(str) {
    str = str.replace(/[^a-z0-9]/g, '');
    return str === str.split('').reverse().join('');
}

function checkPalindrome() {
    let userInput = prompt("Enter a string to check if it's a palindrome:");
    if (userInput) {
        if (isPalindrome(userInput)) {
            console.log("It's a palindrome");
        } else {
            console.log("Not a palindrome!");
        }
    } else {
        console.log("No input provided.");
    }
}

checkPalindrome();