package csci571.usc.homework9.entity;

import java.util.List;

/**
 * Created by xuchen on 2017/4/19.
 */

public class ProfileEntry {

    /**
     * data : [{"id":"440118383002014","name":"Usc Mezidon Foot","picture":{"data":{"height":348,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/12294812_182587018755153_5700358192209376194_n.jpg?oh=d8211ee952b03148f11cb67060fe61b2&oe=594DA417","width":348}}},{"id":"882911975145670","name":"Uschi Graf","picture":{"data":{"height":362,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/c99.29.362.362/228825_102892506480958_7197378_n.jpg?oh=bdde1c889083ec3a9dde006db51d5235&oe=59841E36","width":362}}},{"id":"1335353679877884","name":"Uschi Strobl","picture":{"data":{"height":540,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/c0.81.540.540/17634786_1328741943872391_6930947651122337919_n.jpg?oh=61090d11f4ce1cd1c32e263daa7c695a&oe=594D0B37","width":540}}},{"id":"1581194701909970","name":"Uschi Appel","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/14141839_1373309506031825_4181152479489025060_n.jpg?oh=0d240468f168a76b160704adf4767483&oe=598B4E79","width":720}}},{"id":"212492465900767","name":"Uschi Meyer","picture":{"data":{"height":297,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/c0.0.297.297/15032796_110889202727761_2265148456188172035_n.jpg?oh=a35b482b8652cc8ab50fa093c338590b&oe=5980D402","width":297}}},{"id":"292372254524633","name":"Apple Usc Lim","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/c0.0.720.720/p720x720/13620228_137653143329879_3776760913840205854_n.jpg?oh=b56a616b63ef42e83974eb3af7418770&oe=59884969","width":720}}},{"id":"803418849809324","name":"Uschi Held","picture":{"data":{"height":640,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/11896013_523995194418359_6866888962668970013_n.jpg?oh=242323a243beb6cf274b7d874b02a0d6&oe=59923907","width":640}}},{"id":"1684783148206316","name":"Usc Pouyastruc","picture":{"data":{"height":455,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/15822998_1562345380450094_8679072920605621336_n.jpg?oh=da6deb26bedc7fcabcc1b19c14ff51fb&oe=59817485","width":455}}},{"id":"1439420272787757","name":"Kbso Usc","picture":{"data":{"height":509,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/c41.41.509.509/545143_349607618435700_1356263905_n.jpg?oh=ea48566f78599ed7ce8f733652dfdb55&oe=5988F23B","width":509}}},{"id":"1293210960771351","name":"Uschi Schoenfelder","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/17966741_1332879130137867_6134985151248375120_o.jpg?oh=d474b9a3e750b361d7e617cdd813792c&oe=597DED98","width":720}}},{"id":"1319590431467707","name":"Uschi Melly","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/17637045_1345899962170087_3786702588756594912_o.jpg?oh=85bf85880520cb3a603adb892c40e8a9&oe=5990C8FC","width":720}}},{"id":"1351453534914061","name":"Uschi Gashi","picture":{"data":{"height":433,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/c22.0.433.433/394671_384749004917857_1169926287_n.jpg?oh=4a4eb44747fefcbbf4381ec6a51c3e3e&oe=594CA92E","width":433}}},{"id":"779479192207241","name":"Uschi Keskin","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/17492995_772607309561096_1193891623642696504_o.jpg?oh=3b91a8b699966536e2c485e3a834e0ec&oe=599A475E","width":720}}},{"id":"1748844395430732","name":"Pamela Uscanga","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/17760860_1767370273578144_5017819692815434165_o.jpg?oh=f8bef29eef419271982e325b01eae102&oe=599B5470","width":720}}},{"id":"956140374522179","name":"Eunice Uscanga","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/17972029_962730873863129_7428536133733429079_o.jpg?oh=89614ee9bf1372a9111c939f27c5435d&oe=598BC782","width":720}}},{"id":"291445471275687","name":"Edith Usca","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/c0.0.720.720/p720x720/17855084_292850314468536_7311932981314038589_o.jpg?oh=62f71a73f38a021bf1c31d775eaafc35&oe=597ABCA1","width":720}}},{"id":"406780859697597","name":"Kasia Uscilko","picture":{"data":{"height":480,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/12400741_129112820797737_8310246486908390466_n.jpg?oh=00f8ae40fa90ea11c89c484401f76a4d&oe=59984CCF","width":480}}},{"id":"1929368267292875","name":"Miguel Angel Uscanga Valdes","picture":{"data":{"height":540,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/15941391_1901968156699553_4657856302743884575_n.jpg?oh=d33e375dbcc398837028cb3b81fbd695&oe=597B268F","width":540}}},{"id":"10208210724738024","name":"Susy Uscanga Dominguez","picture":{"data":{"height":639,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/16472967_10207990129863290_8894927932569714503_n.jpg?oh=62a1bfc3451faab9c5b89dfbf16d7082&oe=597C96DF","width":639}}},{"id":"1930494940514866","name":"Usc Handball LA Charite","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/11025918_1617870285110668_2247193094610616000_o.jpg?oh=78fa0c26489cb4adb958e0640cc41cf9&oe=59820959","width":720}}},{"id":"1286708614754839","name":"Jose Uscanga","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/p720x720/17854754_1322412274517806_3514845008390093411_o.jpg?oh=c82ec782d5a84d1093df1a7edb85f921&oe=59805171","width":720}}},{"id":"10211699216053085","name":"Uschi Hesse","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/c0.0.720.720/p720x720/919150_10201898291156088_1513177407_o.jpg?oh=1a47ac131bbca8ba074edd0979ebdeaf&oe=59880AEE","width":720}}},{"id":"1561985053841622","name":"Uschi Zeiser-Graf","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/c0.0.720.720/p720x720/16992456_1557355254304602_1509128847866055456_o.jpg?oh=b09cb3b17e80034bf394aaeacfc619ca&oe=5986992B","width":720}}},{"id":"277322652725357","name":"Uscefe-kubabhemu Bahubhe Omusha Ngcongo","picture":{"data":{"height":720,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t31.0-1/c0.281.720.720/p720x720/14352104_136061420184815_4500995459938675044_o.jpg?oh=05b5ac4acb31d45650c406c2ab879c22&oe=598258C9","width":720}}},{"id":"1441665205898103","name":"Uschi Fellner","picture":{"data":{"height":640,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/10898216_840230782708218_6498489422408436472_n.jpg?oh=ec68fa06bf37199652f95eceb904a88c&oe=594DD863","width":640}}}]
     * paging : {"next":"https://graph.facebook.com/v2.8/search?fields=id,name,picture.width%28700%29.height%28700%29&type=user&q=usc&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&limit=25&offset=25&__after_id=enc_AdAM19jIrkNwreOkLFALioF0Mde4ZALZBMKwl5rpU4ZAT9S9JgT1mSKpYvEeYxd49oxgS54N6lTyoYVFilFR8eNMOTE"}
     */

    private PagingBean paging;
    private List<DataBeanX> data;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<DataBeanX> getData() {
        return data;
    }

    public void setData(List<DataBeanX> data) {
        this.data = data;
    }

    public static class PagingBean {
        /**
         * next : https://graph.facebook.com/v2.8/search?fields=id,name,picture.width%28700%29.height%28700%29&type=user&q=usc&access_token=EAAFEQ3QaLo4BAFhb8ttZBC7pevj16spW3pZCnxBfD1EUy8MZAG6XofJppyLfrazwTMrE59QO7GTDCexzIW13aPtDIGmb9fy0wI0xB9TqwpDbDDBTCwOKG2kZCR5bF6vkcZBrWq0HezIQju4TDqKMBP3L8taCl3AQZD&limit=25&offset=25&__after_id=enc_AdAM19jIrkNwreOkLFALioF0Mde4ZALZBMKwl5rpU4ZAT9S9JgT1mSKpYvEeYxd49oxgS54N6lTyoYVFilFR8eNMOTE
         */

        private String next;
        private String previous;

        public String getPrevious(){
            return previous;
        }

        public void setPrevious(String previous)
        {
            this.previous=previous;
        }


        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }
    }

    public static class DataBeanX {
        /**
         * id : 440118383002014
         * name : Usc Mezidon Foot
         * picture : {"data":{"height":348,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/12294812_182587018755153_5700358192209376194_n.jpg?oh=d8211ee952b03148f11cb67060fe61b2&oe=594DA417","width":348}}
         */

        private String id;
        private String name;
        private PictureBean picture;

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

        public static class PictureBean {
            /**
             * data : {"height":348,"is_silhouette":false,"url":"https://scontent.xx.fbcdn.net/v/t1.0-1/12294812_182587018755153_5700358192209376194_n.jpg?oh=d8211ee952b03148f11cb67060fe61b2&oe=594DA417","width":348}
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
                 * height : 348
                 * is_silhouette : false
                 * url : https://scontent.xx.fbcdn.net/v/t1.0-1/12294812_182587018755153_5700358192209376194_n.jpg?oh=d8211ee952b03148f11cb67060fe61b2&oe=594DA417
                 * width : 348
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
    }
}
