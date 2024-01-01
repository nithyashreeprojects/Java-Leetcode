public class MinimumMaximum {

    public static int minimumPages(int[] pages, int students) {
        if (students > pages.length) {
            return -1;
        }

        int l = pages[0];
        int h = 0;
        int result = 0;

        for (int i = 0; i < pages.length; i++) {
            if (pages[i] < l) {
                l = pages[i];
            }
            // h is the sum of all pages
            h = h + pages[i];
        }

        while (l <= h) {
            int m = (l + h) / 2;
            if (itsPossibleSolution(pages, students, m)) {
                l = m + 1;
                result = m;
            } else {
                h = m - 1;
            }
        }
        return result;
    }

    public static boolean itsPossibleSolution(int[] pages, int students, int m) {
        int student = 1;
        int pagecount = 0;

        for (int i = 0; i < pages.length; i++) {
            if (pages[i] > m) {
                return false;
            }

            if (pagecount + pages[i] <= m) {
                pagecount = pagecount + pages[i];
            } else {
                student++;
                if (student > students) {
                    return false;
                }
                pagecount = pages[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students = 2;
        System.out.println(minimumPages(pages, students));
    }
}
