package csci571.usc.homework9.entity;

import java.util.List;

/**
 * Created by xuchen on 2017/4/20.
 */

public class DetailEntry {

    /**
     * id : 134972803193847
     * name : University of Southern California
     * picture : {"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/c104.117.979.979/s720x720/11154997_985696921454760_2198316150351235477_o.jpg?oh=60a03db9523bc4519715c3fb2272805e&oe=59811D63","width":720}}
     * albums : {"data":[{"name":"Timeline Photos","photos":{"data":[{"name":"This is what excitement looks like. Only two weeks until classes end! ✌️","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17904078_1532707786753668_3865999634410237439_n.jpg?oh=35ac81f09ea29f2c13dfd775f279f769&oe=598DF34F","id":"1532707786753668"},{"name":"Seems like Doheny Library tops the list of \"favorite places to study\" on campus. Doesn't look much different than it did in the 1930s! ❤️ 💛 📚\n#ThrowbackThursday #NationalLibrariesWeek","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17634723_1531340506890396_3760287247740990309_n.jpg?oh=697562a455a48c993dcc8a40f2e53ec2&oe=599AE550","id":"1531340506890396"}],"paging":{"cursors":{"before":"MTUzMjcwNzc4Njc1MzY2OAZDZD","after":"MTUzMTM0MDUwNjg5MDM5NgZDZD"},"next":"https://graph.facebook.com/v2.8/145792482111879/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTUzMTM0MDUwNjg5MDM5NgZDZD"}},"id":"145792482111879"},{"name":"Stem Cell Day of Discovery at USC Health Sciences Campus","photos":{"data":[{"name":"A student views how cells are held in long term cold storage tanks at -195 celsius at the Stem Cell Day of Discovery event held at the USC Health Sciences Campus in Los Angeles, CA. February 4th, 2017. The event encourages students to learn more about STEM opportunities, including stem cell study and biotech, and helps demystify the fields and encourage student engagement. Photo by David Sprague","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/16508358_1456199354404512_2718016290597062250_n.jpg?oh=cae6cc5b67e98bf3253dd55c830e016d&oe=598F524F","id":"1456199354404512"},{"name":"A wall of posters celebrating stem cell research goes up outside of The Broad Center for Regenerative Medicine and Stem Cell Research at USC and Stem Cell Research during the Stem Cell Day of Discovery event held at the USC Health Sciences Campus in Los Angeles, CA. February 4th, 2017. The event encourages students to learn more about STEM opportunities, including stem cell study and biotech, and helps demystify the fields and encourage student engagement. Photo by David Sprague","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/16427561_1456199081071206_5929451143490353953_n.jpg?oh=6e0444c302af1d4fce033051a3085729&oe=597F10FF","id":"1456199081071206"}],"paging":{"cursors":{"before":"MTQ1NjE5OTM1NDQwNDUxMgZDZD","after":"MTQ1NjE5OTA4MTA3MTIwNgZDZD"},"next":"https://graph.facebook.com/v2.8/1456198801071234/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTQ1NjE5OTA4MTA3MTIwNgZDZD"}},"id":"1456198801071234"},{"name":"Cover Photos","photos":{"data":[{"picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/15894257_1421754101182371_7248206473538558961_n.jpg?oh=5defa0f53116c800c8c106acc37f939c&oe=597D4FDB","id":"1421754101182371"},{"name":"Happy holidays to our Trojan Family!","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/15202510_1376868012337647_1134125730224756991_n.jpg?oh=c77ae93c52717a60ec6b6b6c1176d740&oe=594F7E72","id":"1376868012337647"}],"paging":{"cursors":{"before":"MTQyMTc1NDEwMTE4MjM3MQZDZD","after":"MTM3Njg2ODAxMjMzNzY0NwZDZD"},"next":"https://graph.facebook.com/v2.8/392765050747953/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTM3Njg2ODAxMjMzNzY0NwZDZD"}},"id":"392765050747953"},{"name":"Untitled Album","photos":{"data":[{"name":"Find us on Snapchat! 👻 - USCofficial","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/p130x130/14713737_1338901982800917_2655486917229398461_n.png?oh=fbc2b096345e1d807dbbbe16ec781300&oe=597996E1","id":"1338901982800917"},{"name":"Revisit #USCgrad from the comfort of your couch! Don't miss USC's commencement when it's highlighted tonight on NBC Nightly News and Saturday on C-SPAN","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/11244715_1003216549702797_4373935598866064185_n.jpg?oh=f26a77b677f91f2b26272d71537816fc&oe=598D3501","id":"1003216549702797"}],"paging":{"cursors":{"before":"MTMzODkwMTk4MjgwMDkxNwZDZD","after":"MTAwMzIxNjU0OTcwMjc5NwZDZD"}}},"id":"1003216543036131"},{"name":"USC Commencement 2016","photos":{"data":[{"name":"Flags represent every school at USC","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/13174050_1204423316248785_8051782724002837075_n.jpg?oh=ea5f3a9a6c1ad28f6bad488c256fc6aa&oe=59995B5D","id":"1204423316248785"},{"name":"The Half-Century Trojans come to celebrate fifty years of Trojan Family!","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/13221477_1204423306248786_1098948065632769871_n.jpg?oh=f3efd7f1e7eb89f2e67334f98560bb42&oe=598B7741","id":"1204423306248786"}],"paging":{"cursors":{"before":"MTIwNDQyMzMxNjI0ODc4NQZDZD","after":"MTIwNDQyMzMwNjI0ODc4NgZDZD"},"next":"https://graph.facebook.com/v2.8/1204423006248816/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTIwNDQyMzMwNjI0ODc4NgZDZD"}},"id":"1204423006248816"}],"paging":{"cursors":{"before":"MTQ1NzkyNDgyMTExODc5","after":"MTIwNDQyMzAwNjI0ODgxNgZDZD"},"next":"https://graph.facebook.com/v2.8/134972803193847/albums?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cphotos.limit%282%29%7Bname%2Cpicture%7D&limit=5&after=MTIwNDQyMzAwNjI0ODgxNgZDZD"}}
     * posts : {"data":[{"message":"Chemists at USC may have just cracked a huge problem, using a super simple substance to make carbon neutral energy possible...","created_time":"2017-04-19T19:06:50+0000","id":"134972803193847_1539163182774795"},{"message":"What's on your list of must-see events at this year's #bookfest? 📝 📚\n\nMaybe Margaret Atwood in conversation with Mary McNamara (a USC professor and LA Times editor)? Or professor Viet Thanh Nguyen's conversation with USC alum Laila Lalami?","created_time":"2017-04-19T17:44:47+0000","id":"134972803193847_1539094109448369"},{"story":"University of Southern California shared USC Alumni Association's post.","created_time":"2017-04-19T02:08:00+0000","id":"134972803193847_1538186532872460"},{"message":"By performing the surgery robotically, doctors were able to reduce patient trauma and shorten the hospital stay by up to 15 days.","created_time":"2017-04-19T01:36:00+0000","id":"134972803193847_1538091666215280"},{"message":"Fueling kids' creative fire 🔥 - the USC Young Scientists Program (part of USC's Joint Educational Project) gives area fourth- and fifth-graders hands-on experience with virtual reality, 3D printing and drones!","created_time":"2017-04-18T17:50:59+0000","id":"134972803193847_1525949994090155"}],"paging":{"previous":"https://graph.facebook.com/v2.8/134972803193847/posts?limit=5&since=1492628810&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&__paging_token=enc_AdCxVpejIYnbYtjnSZCfaKembAyS0EAojIEb8DAXw1xZBkOlPT4t7IrznIhA1PnbcahoZA3uDKteFA57RPDxx9FyESmCPm8rApoyk6hkR4XgQURqQZDZD&__previous=1","next":"https://graph.facebook.com/v2.8/134972803193847/posts?limit=5&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&until=1492537859&__paging_token=enc_AdBe8e3csrKqKMfeNmqaWJvZBug1RfYZCxFRZCQwWsEZC9mkGP4CS9CrKOLkX33nZCsRver0opll56Nt6tD5dFGVqousD4pw2uYPJnowKJhSPHyfYRgZDZD"}}
     */

    private String id;
    private String name;
    private PictureBean picture;
    private AlbumsBean albums;
    private PostsBean posts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PictureBean getPicture() {
        return picture;
    }

    public void setPicture(PictureBean picture) {
        this.picture = picture;
    }

    public AlbumsBean getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumsBean albums) {
        this.albums = albums;
    }

    public PostsBean getPosts() {
        return posts;
    }

    public void setPosts(PostsBean posts) {
        this.posts = posts;
    }

    public static class PictureBean {
        /**
         * data : {"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/c104.117.979.979/s720x720/11154997_985696921454760_2198316150351235477_o.jpg?oh=60a03db9523bc4519715c3fb2272805e&oe=59811D63","width":720}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * height : 720
             * is_silhouette : false
             * url : https://scontent.xx.fbcdn.net/v/t31.0-1/c104.117.979.979/s720x720/11154997_985696921454760_2198316150351235477_o.jpg?oh=60a03db9523bc4519715c3fb2272805e&oe=59811D63
             * width : 720
             */

            private int height;
            private boolean is_silhouette;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public boolean isIs_silhouette() {
                return is_silhouette;
            }

            public void setIs_silhouette(boolean is_silhouette) {
                this.is_silhouette = is_silhouette;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class AlbumsBean {
        /**
         * data : [{"name":"Timeline Photos","photos":{"data":[{"name":"This is what excitement looks like. Only two weeks until classes end! ✌️","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17904078_1532707786753668_3865999634410237439_n.jpg?oh=35ac81f09ea29f2c13dfd775f279f769&oe=598DF34F","id":"1532707786753668"},{"name":"Seems like Doheny Library tops the list of \"favorite places to study\" on campus. Doesn't look much different than it did in the 1930s! ❤️ 💛 📚\n#ThrowbackThursday #NationalLibrariesWeek","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17634723_1531340506890396_3760287247740990309_n.jpg?oh=697562a455a48c993dcc8a40f2e53ec2&oe=599AE550","id":"1531340506890396"}],"paging":{"cursors":{"before":"MTUzMjcwNzc4Njc1MzY2OAZDZD","after":"MTUzMTM0MDUwNjg5MDM5NgZDZD"},"next":"https://graph.facebook.com/v2.8/145792482111879/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTUzMTM0MDUwNjg5MDM5NgZDZD"}},"id":"145792482111879"},{"name":"Stem Cell Day of Discovery at USC Health Sciences Campus","photos":{"data":[{"name":"A student views how cells are held in long term cold storage tanks at -195 celsius at the Stem Cell Day of Discovery event held at the USC Health Sciences Campus in Los Angeles, CA. February 4th, 2017. The event encourages students to learn more about STEM opportunities, including stem cell study and biotech, and helps demystify the fields and encourage student engagement. Photo by David Sprague","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/16508358_1456199354404512_2718016290597062250_n.jpg?oh=cae6cc5b67e98bf3253dd55c830e016d&oe=598F524F","id":"1456199354404512"},{"name":"A wall of posters celebrating stem cell research goes up outside of The Broad Center for Regenerative Medicine and Stem Cell Research at USC and Stem Cell Research during the Stem Cell Day of Discovery event held at the USC Health Sciences Campus in Los Angeles, CA. February 4th, 2017. The event encourages students to learn more about STEM opportunities, including stem cell study and biotech, and helps demystify the fields and encourage student engagement. Photo by David Sprague","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/16427561_1456199081071206_5929451143490353953_n.jpg?oh=6e0444c302af1d4fce033051a3085729&oe=597F10FF","id":"1456199081071206"}],"paging":{"cursors":{"before":"MTQ1NjE5OTM1NDQwNDUxMgZDZD","after":"MTQ1NjE5OTA4MTA3MTIwNgZDZD"},"next":"https://graph.facebook.com/v2.8/1456198801071234/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTQ1NjE5OTA4MTA3MTIwNgZDZD"}},"id":"1456198801071234"},{"name":"Cover Photos","photos":{"data":[{"picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/15894257_1421754101182371_7248206473538558961_n.jpg?oh=5defa0f53116c800c8c106acc37f939c&oe=597D4FDB","id":"1421754101182371"},{"name":"Happy holidays to our Trojan Family!","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/15202510_1376868012337647_1134125730224756991_n.jpg?oh=c77ae93c52717a60ec6b6b6c1176d740&oe=594F7E72","id":"1376868012337647"}],"paging":{"cursors":{"before":"MTQyMTc1NDEwMTE4MjM3MQZDZD","after":"MTM3Njg2ODAxMjMzNzY0NwZDZD"},"next":"https://graph.facebook.com/v2.8/392765050747953/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTM3Njg2ODAxMjMzNzY0NwZDZD"}},"id":"392765050747953"},{"name":"Untitled Album","photos":{"data":[{"name":"Find us on Snapchat! 👻 - USCofficial","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/p130x130/14713737_1338901982800917_2655486917229398461_n.png?oh=fbc2b096345e1d807dbbbe16ec781300&oe=597996E1","id":"1338901982800917"},{"name":"Revisit #USCgrad from the comfort of your couch! Don't miss USC's commencement when it's highlighted tonight on NBC Nightly News and Saturday on C-SPAN","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/11244715_1003216549702797_4373935598866064185_n.jpg?oh=f26a77b677f91f2b26272d71537816fc&oe=598D3501","id":"1003216549702797"}],"paging":{"cursors":{"before":"MTMzODkwMTk4MjgwMDkxNwZDZD","after":"MTAwMzIxNjU0OTcwMjc5NwZDZD"}}},"id":"1003216543036131"},{"name":"USC Commencement 2016","photos":{"data":[{"name":"Flags represent every school at USC","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/13174050_1204423316248785_8051782724002837075_n.jpg?oh=ea5f3a9a6c1ad28f6bad488c256fc6aa&oe=59995B5D","id":"1204423316248785"},{"name":"The Half-Century Trojans come to celebrate fifty years of Trojan Family!","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/13221477_1204423306248786_1098948065632769871_n.jpg?oh=f3efd7f1e7eb89f2e67334f98560bb42&oe=598B7741","id":"1204423306248786"}],"paging":{"cursors":{"before":"MTIwNDQyMzMxNjI0ODc4NQZDZD","after":"MTIwNDQyMzMwNjI0ODc4NgZDZD"},"next":"https://graph.facebook.com/v2.8/1204423006248816/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTIwNDQyMzMwNjI0ODc4NgZDZD"}},"id":"1204423006248816"}]
         * paging : {"cursors":{"before":"MTQ1NzkyNDgyMTExODc5","after":"MTIwNDQyMzAwNjI0ODgxNgZDZD"},"next":"https://graph.facebook.com/v2.8/134972803193847/albums?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cphotos.limit%282%29%7Bname%2Cpicture%7D&limit=5&after=MTIwNDQyMzAwNjI0ODgxNgZDZD"}
         */

        private PagingBean paging;
        private List<DataBeanXX> data;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<DataBeanXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXX> data) {
            this.data = data;
        }

        public static class PagingBean {
            /**
             * cursors : {"before":"MTQ1NzkyNDgyMTExODc5","after":"MTIwNDQyMzAwNjI0ODgxNgZDZD"}
             * next : https://graph.facebook.com/v2.8/134972803193847/albums?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cphotos.limit%282%29%7Bname%2Cpicture%7D&limit=5&after=MTIwNDQyMzAwNjI0ODgxNgZDZD
             */

            private CursorsBean cursors;
            private String next;

            public CursorsBean getCursors() {
                return cursors;
            }

            public void setCursors(CursorsBean cursors) {
                this.cursors = cursors;
            }

            public String getNext() {
                return next;
            }

            public void setNext(String next) {
                this.next = next;
            }

            public static class CursorsBean {
                /**
                 * before : MTQ1NzkyNDgyMTExODc5
                 * after : MTIwNDQyMzAwNjI0ODgxNgZDZD
                 */

                private String before;
                private String after;

                public String getBefore() {
                    return before;
                }

                public void setBefore(String before) {
                    this.before = before;
                }

                public String getAfter() {
                    return after;
                }

                public void setAfter(String after) {
                    this.after = after;
                }
            }
        }

        public static class DataBeanXX {
            /**
             * name : Timeline Photos
             * photos : {"data":[{"name":"This is what excitement looks like. Only two weeks until classes end! ✌️","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17904078_1532707786753668_3865999634410237439_n.jpg?oh=35ac81f09ea29f2c13dfd775f279f769&oe=598DF34F","id":"1532707786753668"},{"name":"Seems like Doheny Library tops the list of \"favorite places to study\" on campus. Doesn't look much different than it did in the 1930s! ❤️ 💛 📚\n#ThrowbackThursday #NationalLibrariesWeek","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17634723_1531340506890396_3760287247740990309_n.jpg?oh=697562a455a48c993dcc8a40f2e53ec2&oe=599AE550","id":"1531340506890396"}],"paging":{"cursors":{"before":"MTUzMjcwNzc4Njc1MzY2OAZDZD","after":"MTUzMTM0MDUwNjg5MDM5NgZDZD"},"next":"https://graph.facebook.com/v2.8/145792482111879/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTUzMTM0MDUwNjg5MDM5NgZDZD"}}
             * id : 145792482111879
             */

            private String name;
            private PhotosBean photos;
            private String id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public PhotosBean getPhotos() {
                return photos;
            }

            public void setPhotos(PhotosBean photos) {
                this.photos = photos;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class PhotosBean {
                /**
                 * data : [{"name":"This is what excitement looks like. Only two weeks until classes end! ✌️","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17904078_1532707786753668_3865999634410237439_n.jpg?oh=35ac81f09ea29f2c13dfd775f279f769&oe=598DF34F","id":"1532707786753668"},{"name":"Seems like Doheny Library tops the list of \"favorite places to study\" on campus. Doesn't look much different than it did in the 1930s! ❤️ 💛 📚\n#ThrowbackThursday #NationalLibrariesWeek","picture":"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17634723_1531340506890396_3760287247740990309_n.jpg?oh=697562a455a48c993dcc8a40f2e53ec2&oe=599AE550","id":"1531340506890396"}]
                 * paging : {"cursors":{"before":"MTUzMjcwNzc4Njc1MzY2OAZDZD","after":"MTUzMTM0MDUwNjg5MDM5NgZDZD"},"next":"https://graph.facebook.com/v2.8/145792482111879/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTUzMTM0MDUwNjg5MDM5NgZDZD"}
                 */

                private PagingBeanX paging;
                private List<DataBeanX> data;

                public PagingBeanX getPaging() {
                    return paging;
                }

                public void setPaging(PagingBeanX paging) {
                    this.paging = paging;
                }

                public List<DataBeanX> getData() {
                    return data;
                }

                public void setData(List<DataBeanX> data) {
                    this.data = data;
                }

                public static class PagingBeanX {
                    /**
                     * cursors : {"before":"MTUzMjcwNzc4Njc1MzY2OAZDZD","after":"MTUzMTM0MDUwNjg5MDM5NgZDZD"}
                     * next : https://graph.facebook.com/v2.8/145792482111879/photos?access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&pretty=1&fields=name%2Cpicture&limit=2&after=MTUzMTM0MDUwNjg5MDM5NgZDZD
                     */

                    private CursorsBeanX cursors;
                    private String next;

                    public CursorsBeanX getCursors() {
                        return cursors;
                    }

                    public void setCursors(CursorsBeanX cursors) {
                        this.cursors = cursors;
                    }

                    public String getNext() {
                        return next;
                    }

                    public void setNext(String next) {
                        this.next = next;
                    }

                    public static class CursorsBeanX {
                        /**
                         * before : MTUzMjcwNzc4Njc1MzY2OAZDZD
                         * after : MTUzMTM0MDUwNjg5MDM5NgZDZD
                         */

                        private String before;
                        private String after;

                        public String getBefore() {
                            return before;
                        }

                        public void setBefore(String before) {
                            this.before = before;
                        }

                        public String getAfter() {
                            return after;
                        }

                        public void setAfter(String after) {
                            this.after = after;
                        }
                    }
                }

                public static class DataBeanX {
                    /**
                     * name : This is what excitement looks like. Only two weeks until classes end! ✌️
                     * picture : https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/17904078_1532707786753668_3865999634410237439_n.jpg?oh=35ac81f09ea29f2c13dfd775f279f769&oe=598DF34F
                     * id : 1532707786753668
                     */

                    private String name;
                    private String picture;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getPicture() {
                        return picture;
                    }

                    public void setPicture(String picture) {
                        this.picture = picture;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }
        }
    }

    public static class PostsBean {
        /**
         * data : [{"message":"Chemists at USC may have just cracked a huge problem, using a super simple substance to make carbon neutral energy possible...","created_time":"2017-04-19T19:06:50+0000","id":"134972803193847_1539163182774795"},{"message":"What's on your list of must-see events at this year's #bookfest? 📝 📚\n\nMaybe Margaret Atwood in conversation with Mary McNamara (a USC professor and LA Times editor)? Or professor Viet Thanh Nguyen's conversation with USC alum Laila Lalami?","created_time":"2017-04-19T17:44:47+0000","id":"134972803193847_1539094109448369"},{"story":"University of Southern California shared USC Alumni Association's post.","created_time":"2017-04-19T02:08:00+0000","id":"134972803193847_1538186532872460"},{"message":"By performing the surgery robotically, doctors were able to reduce patient trauma and shorten the hospital stay by up to 15 days.","created_time":"2017-04-19T01:36:00+0000","id":"134972803193847_1538091666215280"},{"message":"Fueling kids' creative fire 🔥 - the USC Young Scientists Program (part of USC's Joint Educational Project) gives area fourth- and fifth-graders hands-on experience with virtual reality, 3D printing and drones!","created_time":"2017-04-18T17:50:59+0000","id":"134972803193847_1525949994090155"}]
         * paging : {"previous":"https://graph.facebook.com/v2.8/134972803193847/posts?limit=5&since=1492628810&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&__paging_token=enc_AdCxVpejIYnbYtjnSZCfaKembAyS0EAojIEb8DAXw1xZBkOlPT4t7IrznIhA1PnbcahoZA3uDKteFA57RPDxx9FyESmCPm8rApoyk6hkR4XgQURqQZDZD&__previous=1","next":"https://graph.facebook.com/v2.8/134972803193847/posts?limit=5&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&until=1492537859&__paging_token=enc_AdBe8e3csrKqKMfeNmqaWJvZBug1RfYZCxFRZCQwWsEZC9mkGP4CS9CrKOLkX33nZCsRver0opll56Nt6tD5dFGVqousD4pw2uYPJnowKJhSPHyfYRgZDZD"}
         */

        private PagingBeanXX paging;
        private List<DataBeanXXX> data;

        public PagingBeanXX getPaging() {
            return paging;
        }

        public void setPaging(PagingBeanXX paging) {
            this.paging = paging;
        }

        public List<DataBeanXXX> getData() {
            return data;
        }

        public void setData(List<DataBeanXXX> data) {
            this.data = data;
        }

        public static class PagingBeanXX {
            /**
             * previous : https://graph.facebook.com/v2.8/134972803193847/posts?limit=5&since=1492628810&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&__paging_token=enc_AdCxVpejIYnbYtjnSZCfaKembAyS0EAojIEb8DAXw1xZBkOlPT4t7IrznIhA1PnbcahoZA3uDKteFA57RPDxx9FyESmCPm8rApoyk6hkR4XgQURqQZDZD&__previous=1
             * next : https://graph.facebook.com/v2.8/134972803193847/posts?limit=5&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&until=1492537859&__paging_token=enc_AdBe8e3csrKqKMfeNmqaWJvZBug1RfYZCxFRZCQwWsEZC9mkGP4CS9CrKOLkX33nZCsRver0opll56Nt6tD5dFGVqousD4pw2uYPJnowKJhSPHyfYRgZDZD
             */

            private String previous;
            private String next;

            public String getPrevious() {
                return previous;
            }

            public void setPrevious(String previous) {
                this.previous = previous;
            }

            public String getNext() {
                return next;
            }

            public void setNext(String next) {
                this.next = next;
            }
        }

        public static class DataBeanXXX {
            /**
             * message : Chemists at USC may have just cracked a huge problem, using a super simple substance to make carbon neutral energy possible...
             * created_time : 2017-04-19T19:06:50+0000
             * id : 134972803193847_1539163182774795
             * story : University of Southern California shared USC Alumni Association's post.
             */

            private String message;
            private String created_time;
            private String id;
            private String story;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getCreated_time() {
                return created_time;
            }

            public void setCreated_time(String created_time) {
                this.created_time = created_time;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getStory() {
                return story;
            }

            public void setStory(String story) {
                this.story = story;
            }
        }
    }
}
