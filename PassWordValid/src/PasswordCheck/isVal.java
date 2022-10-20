package PasswordCheck;

public class isVal {
    
    public static boolean isPassValid(String password) {
    boolean checkLength = false;
    boolean checkLower = false;
    boolean checkUpper = false;
    boolean checkNum = false;
    boolean checkSpecialChar = false;

    for (int i = 0; i < password.length(); i++){
       
       
       //Checks that the length of the password is between 8 and 16 inclusive
        if (password.length() >= 8 && password.length() <= 16){
            checkLength = true;
        }

    
        if ((password.charAt(i) >= 48 && password.charAt(i) <= 57)){    //Checks if the password contains number between [0-9]
            checkNum = true;
        } else if ((password.charAt(i) >= 97 && password.charAt(i) <= 122)){    //Checks if the password contains lower case letters
            checkLower =true;
        } else if ((password.charAt(i) >= 65 && password.charAt(i) <= 90)){     //Checks if the password contains upper case letters
            checkUpper = true;
        } else if ((password.charAt(i) >= 35 && password.charAt(i) <= 38) || ((password.charAt(i) >= 40 && password.charAt(i) <= 43)) || (password.charAt(i) == 45) || (password.charAt(i) == 47) || (password.charAt(i) == 33)){  //Checks if the password contains special characters
            checkSpecialChar = true;
        }


        //If the boolean values returned above are true this will update the boolean variables to be true
        if (checkLength && checkNum && checkLower && checkUpper && checkSpecialChar){
            System.out.println("Password is valid!");
            return true;
        }
    }


        //If even one of the conditions is not met then the password is invalid and will return false
        System.out.println("Invalid password!");
        return false;
    }
    
}