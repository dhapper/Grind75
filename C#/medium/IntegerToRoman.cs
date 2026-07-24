public class Solution {
    public string IntToRoman(int num) {

        string numStr = num.ToString();
        
        int digit = -1;

        string romStr = "";

        for(int i = 0; i < numStr.Length; i++){

            digit = numStr[i] - '0';
            Console.WriteLine(digit);

            
            switch (numStr.Length - i - 1) {
            case 0:
                romStr += Convert(digit, "I", "V", "X");
                Console.WriteLine(Convert(digit, "I", "V", "X"));
                break;
            case 1:
                romStr += Convert(digit, "X", "L", "C");
                Console.WriteLine(Convert(digit, "X", "L", "C"));
                break;
            case 2:
                romStr += Convert(digit, "C", "D", "M");
                Console.WriteLine(Convert(digit, "C", "D", "M"));
                break;
            case 3:
                for(int j = 0; j < digit; j++){
                    romStr += "M";
                }
                break;
            }
            
        }

        
        return romStr;

    }

public string Convert(int digit, string symbol1, string symbol2, string symbol3) {
    string digitStr = "";

    if(digit == 9){
        digitStr = symbol1 + symbol3;
    }
    else if(digit == 4){
        digitStr = symbol1 + symbol2;
    }
    else{
        if(digit > 4) digitStr += symbol2; // <-- change symbol3 to symbol2

        int remainder = digit > 4 ? digit - 5 : digit; 

        for(int i = 0; i < remainder; i++){ // <-- use remainder
            digitStr += symbol1;
        }
    }

    return digitStr;
}

}