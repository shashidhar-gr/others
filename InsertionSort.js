var insertionSort = function(arr) {
    for(let i = 1; i < arr.length; i++) {
        let key = arr[i];
        let j = i-1;
        while(arr[j] > key && j >= 0) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
    return arr;
};

let arr = [3, 7, 9, 5, 8, 4, 10];
console.log(insertionSort(arr));