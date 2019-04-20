package JavaClass;

public class Logic {
    private String textArea1;
    private String textArea2;
    private String text111 = "";
    private String text222 = "";

    public Logic(String textArea1, String textArea2) {
        this.textArea1 = textArea1;
        this.textArea2 = textArea2;
        logic();
    }

    private void logic(){
        String[] line;
        String delimeter = "\n";
        line = textArea1.split(delimeter);
        //System.out.println(line.length);

        for (int i = 0 ; i<line.length ; i++){
            //System.out.println(line[i]);
            String tempWord = line[i];
            if (tempWord.indexOf(' ') != -1){
                line[i] = tempWord.substring(0, tempWord.length()-1);
            }
        }

        String str = textArea2;
        String[] srt2;
        String delimeter2 = "\n";
        srt2 = textArea2.split(delimeter2);

        int tempParam = 0;
        for (int i = 0 ; i<line.length ; i++) {
            //System.out.println(line[i]);

            String tempWirhPoint = line[i]+"." ;
            String tempWithChar = line[i]+"," ;

            if (str.indexOf(line[i]) != -1 || str.indexOf(tempWirhPoint) != -1 || str.indexOf(tempWithChar) != -1) {
                String []splitArray = textArea2.split(line[i]);
                tempParam = splitArray.length - 1;
            }
            line[i] = line[i] + " ("+tempParam+")";
            tempParam = 0;
        }

        String forPrint = "" ;
        for (int i = 0 ; i<line.length ; i++){
            // System.out.println(line[i]);
            forPrint = forPrint + line[i]+" \n";
        }

        text111 = "";
        for (int aaa = 0 ; aaa<line.length ; aaa++){
            text111 = text111 + line[aaa] + "\n";
        }

        text222 = "";
        for (int bbb = 0 ; bbb<srt2.length ; bbb++){
            text222 = text222 + srt2[bbb] + "\n";
        }
    }

    public String getText111() {
        return text111;
    }

    public String getText222() {
        return text222;
    }

}
