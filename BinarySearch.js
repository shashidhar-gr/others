//TC: O(logN)
var binarySearch = function(arr, element) {
    
    let index = search(arr, element, 0, arr.length-1);
    
    return index;
};

var search = function(arr, element, left, right) {
    if(left > right) {
        return -1;
    }
    let mid = Math.floor((left + right) / 2);
    if(arr[mid] == element) {
        return mid;
    }
    else if(arr[mid] > element) {
        return search(arr, element, 0, mid-1);
    }
    else {
        return search(arr, element, mid+1, arr.length-1);
    }
    return -1;
};

let arr = [1, 2, 4, 5, 6, 10, 12, 50];
element = 51;

console.log(binarySearch(arr, element));