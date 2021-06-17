package ConverterProject;

class Reverse {
    public String reverseBinary(String cos) {
        char[] arr = cos.toCharArray();
        String reverseBinary = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseBinary += arr[i] + "";
        }
        return reverseBinary;
    }
}
