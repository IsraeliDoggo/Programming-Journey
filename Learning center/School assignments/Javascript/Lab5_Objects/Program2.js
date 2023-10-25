// declares object "courses"
let courses = {
    // declares imbedded objects for each course
    170: {
        title: "Introduction to Programming",
        description: "Develop algorithms for computers",
        creditHours: 5
    },

    250: {
        title: "Web Development",
        description: "Build web applications",
        creditHours: 3
    },

    310: {
        title: "Operating Systems",
        description: "Process management and memory management",
        creditHours: 3
    },

    430: {
        title: "Artificial Intelligence",
        description: "Simulate human thinking",
        creditHours: 2
    }
};

// loops the program to find each courseName with 3 creditHours
for (let courseName in courses) {
    //declares creditHours and the course description
    let creditHours = courses[courseName].creditHours;
    let description = courses[courseName].description;

    // if the credit hours is 3, outputs results
    if (creditHours === 3) {
        console.log(courseName + ": " + description);
    }
}