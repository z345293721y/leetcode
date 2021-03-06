package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyu
 * @version V1.0
 * @ClassName: LetterCombinationsPhoneNumber
 * @Description: TOTO
 * @date 2018/12/17 15:37
 **/


public class LetterCombinationsPhoneNumber {
    @Test
    public void fun() {
        String digits = "23";
        List<String> list = letterCombinationsPhoneNumber(digits);
        System.out.println(list);
    }

    // 获取链表长度的list，然后再进行买个遍历
    private List<String> letterCombinationsPhoneNumber(String digits) {
        List<String> list = new ArrayList<>();
        for (char ch : digits.toCharArray()) {
            String newString = getString(ch);
            list.add(newString);
        }
        return list;
    }
    private String getString(char c) {
        if (c >= '2' || c <= '9') {
            switch (c) {
                case '2':
                    return "abc";
                case '3':
                    return "def";
                case '4':
                    return "ghi";
                case '5':
                    return "jkl";
                case '6':
                    return "mno";
                case '7':
                    return "pqrs";
                case '8':
                    return "tuv";
                case '9':
                    return "wxyz";
                default:
                    break;
            }
        }
        return "";
    }
}
