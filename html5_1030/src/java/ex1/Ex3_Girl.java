package ex1;

/**
 *
 * @author kosta Document : Ex3_Girl Created on : 2014. 10. 30. 오후 1:37:22
 */
public class Ex3_Girl {

    public String[] getGirlGroup(String code) {
        if (code.equals("1")) {
            String[] girl = {"유라", "혜리", "소진", "미라"};
            return girl;
        } else {
            String[] girl = {"보람", "지연", "효민", "은정", "소연"};
            return girl;
        }
    }

}
