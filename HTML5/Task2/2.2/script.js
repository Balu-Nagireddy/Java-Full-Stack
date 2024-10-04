function showJobs(department) {
    document.getElementById('jobOptions').style.display = 'block';
    document.getElementById('itJobs').style.display = 'none';
    document.getElementById('financeJobs').style.display = 'none';
    document.getElementById('hrJobs').style.display = 'none';

    if (department === 'IT') {
        document.getElementById('itJobs').style.display = 'block';
    } else if (department === 'Finance') {
        document.getElementById('financeJobs').style.display = 'block';
    } else if (department === 'HR') {
        document.getElementById('hrJobs').style.display = 'block';
    }
}

function toggleEmployerFields() {
    const employerFields = document.getElementById('employerFields');
    employerFields.style.display = document.getElementsByName('employed')[0].checked ? 'block' : 'none';
}

function validateForm() {
    let isValid = true;
    const requiredFields = ['firstName', 'lastName', 'email', 'phone', 'address', 'city', 'state', 'country', 'educationLevel', 'zip', 'educationType', 'resume'];
    
    requiredFields.forEach(field => {
        const input = document.forms['applyJobForm'][field];
        if (!input.value) {
            input.classList.add('error');
            isValid = false;
        } else {
            input.classList.remove('error');
        }
    });

    const zip = document.forms['applyJobForm']['zip'].value;
    if (!/^\d+$/.test(zip)) {
        document.forms['applyJobForm']['zip'].classList.add('error');
        isValid = false;
    }

    const email = document.forms['applyJobForm']['email'].value;
    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        document.forms['applyJobForm']['email'].classList.add('error');
        isValid = false;
    }

    const phone = document.forms['applyJobForm']['phone'].value;
    if (!/^\d{10}$/.test(phone)) {
        document.forms['applyJobForm']['phone'].classList.add('error');
        isValid = false;
    }

    return isValid;
}
