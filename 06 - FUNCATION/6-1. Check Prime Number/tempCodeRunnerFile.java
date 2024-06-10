for(int i = 2; i<=Math.sqrt(myprime); i++){
            if((myprime % i) == 0){
                return false;
            }
        }