document.getElementById('jobForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const title = document.getElementById('title').value;
    const openingDate = new Date(document.getElementById('openingDate').value);
    const currentDate = new Date();

    if (!title || openingDate < currentDate) {
        alert("Please ensure all fields are filled correctly and the opening date is valid.");
        return;
    }
    document.getElementById('message').innerText = "Job data submitted successfully!";
    this.reset();
});
