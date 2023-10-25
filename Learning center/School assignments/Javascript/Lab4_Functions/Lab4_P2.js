function calculateSupply(age, numPerDay) {

    const maxAge = 100;
    let totalNeeded = (numPerDay * 365) * (maxAge - age);

    console.log("You will need " + totalNeeded + " bags of chips to last you until the ripe old age of " + maxAge);
}

calculateSupply(28, 5);
calculateSupply(62, 12);
calculateSupply(34, 3);