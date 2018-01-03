var Fibonacci = (n) =>{
    var result = [0] * (n+1);
    
    result[0] = 0;
    result[1] = 1;

    for(var i = 2; i< n+1; i++){
        result[i] = result[i-1] + result[i-2];
    }

    return result[n];
}

//Driver Program

