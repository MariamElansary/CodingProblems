
public static int solution(String S) {        

  int maxWords = 0;
  String[] sentences = S.split("\\.|\\?|!");

  for(int i = 0; i < sentences.length; i++) {

    String[] words = sentences[i].replaceAll("^ +| +$|( )+", "$1").split("\\s"); // trim spaces

    if(words.length>maxWords)
      maxWords = words.length;
  }   

  return maxWords;
}
