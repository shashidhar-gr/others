var countFrequency = function(arr) {
    let hashMap = {};
    arr.forEach(element => {
        if(hashMap[element] === undefined) {
            hashMap[element] = 1;
        }
        else {
            hashMap[element] = hashMap[element] + 1;
        }
    });

    console.log(hashMap);
};

const arr = [1, 1, 2, 3, 4, 3, 6, 6, -1, -1, -1];
countFrequency(arr);