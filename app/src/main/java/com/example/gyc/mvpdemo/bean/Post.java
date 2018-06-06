package com.example.gyc.mvpdemo.bean;

import java.util.List;

/**
 * Created by gaoyucong on 2018-06-06.
 */

public class Post {
    /**
     * id : 56
     * date : 2018-06-05T09:05:53
     * date_gmt : 2018-06-05T01:05:53
     * guid : {"rendered":"http://cwbeta.risinfo.cn/?p=56"}
     * modified : 2018-06-05T09:23:11
     * modified_gmt : 2018-06-05T01:23:11
     * slug : %e6%b5%8b%e8%af%95%e7%a4%be%e5%8c%ba%e6%96%b0%e9%97%bb2
     * status : publish
     * type : post
     * link : http://cwbeta.risinfo.cn/2018/06/05/%e6%b5%8b%e8%af%95%e7%a4%be%e5%8c%ba%e6%96%b0%e9%97%bb2/
     * title : {"rendered":"测试社区新闻2"}
     * content : {"rendered":"<p>测试社区新闻2测试社区新闻2测试社区新闻2测试社区新闻2<img class=\"alignnone size-medium wp-image-44\" src=\"http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands-300x169.jpg\" alt=\"\" width=\"300\" height=\"169\" srcset=\"http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands-300x169.jpg 300w, http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands-416x234.jpg 416w, http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands.jpg 554w\" sizes=\"(max-width: 300px) 100vw, 300px\" /><\/p>\n","protected":false}
     * excerpt : {"rendered":"<p>测试社区新闻2测试社区新闻2测试社区新闻2测试社区新闻2<\/p>\n","protected":false}
     * author : 1
     * featured_media : 44
     * comment_status : open
     * ping_status : open
     * sticky : false
     * template :
     * format : standard
     * meta : []
     * categories : [1]
     * tags : []
     * _links : {"self":[{"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/posts/56"}],"collection":[{"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/posts"}],"about":[{"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/types/post"}],"author":[{"embeddable":true,"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/users/1"}],"replies":[{"embeddable":true,"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/comments?post=56"}],"version-history":[{"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/posts/56/revisions"}],"wp:featuredmedia":[{"embeddable":true,"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/media/44"}],"wp:attachment":[{"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/media?parent=56"}],"wp:term":[{"taxonomy":"category","embeddable":true,"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/categories?post=56"},{"taxonomy":"post_tag","embeddable":true,"href":"http://cwbeta.risinfo.cn/wp-json/wp/v2/tags?post=56"}],"curies":[{"name":"wp","href":"https://api.w.org/{rel}","templated":true}]}
     */

    private int id;
    private String date;
    private String date_gmt;
    private Post.GuidBean guid;
    private String modified;
    private String modified_gmt;
    private String slug;
    private String status;
    private String type;
    private String link;
    private Post.TitleBean title;
    private Post.ContentBean content;
    private Post.ExcerptBean excerpt;
    private int author;
    private int featured_media;
    private String comment_status;
    private String ping_status;
    private boolean sticky;
    private String template;
    private String format;
    private Post.LinksBean _links;
    private java.util.List<?> meta;
    private java.util.List<Integer> categories;
    private java.util.List<?> tags;

    public static class GuidBean {
        /**
         * rendered : http://cwbeta.risinfo.cn/?p=56
         */

        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }
    }

    public static class TitleBean {
        /**
         * rendered : 测试社区新闻2
         */

        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }
    }

    public static class ContentBean {
        /**
         * rendered : <p>测试社区新闻2测试社区新闻2测试社区新闻2测试社区新闻2<img class="alignnone size-medium wp-image-44" src="http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands-300x169.jpg" alt="" width="300" height="169" srcset="http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands-300x169.jpg 300w, http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands-416x234.jpg 416w, http://cwbeta.risinfo.cn/wp-content/uploads/2018/06/home-in-hands.jpg 554w" sizes="(max-width: 300px) 100vw, 300px" /></p>

         * protected : false
         */

        private String rendered;
        @com.google.gson.annotations.SerializedName("protected")
        private boolean protectedX;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public boolean isProtectedX() {
            return protectedX;
        }

        public void setProtectedX(boolean protectedX) {
            this.protectedX = protectedX;
        }
    }

    public static class ExcerptBean {
        /**
         * rendered : <p>测试社区新闻2测试社区新闻2测试社区新闻2测试社区新闻2</p>

         * protected : false
         */

        private String rendered;
        @com.google.gson.annotations.SerializedName("protected")
        private boolean protectedX;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public boolean isProtectedX() {
            return protectedX;
        }

        public void setProtectedX(boolean protectedX) {
            this.protectedX = protectedX;
        }
    }

    // FIXME generate failure  field _$WpTerm192
// FIXME generate failure  field _$WpAttachment116
// FIXME generate failure  field _$WpFeaturedmedia96
    public static class LinksBean {
        private java.util.List<Post.LinksBean.SelfBean> self;
        private java.util.List<Post.LinksBean.CollectionBean> collection;
        private java.util.List<Post.LinksBean.AboutBean> about;
        private java.util.List<Post.LinksBean.AuthorBean> author;
        private java.util.List<Post.LinksBean.RepliesBean> replies;
        @com.google.gson.annotations.SerializedName("version-history")
        private java.util.List<Post.LinksBean.VersionhistoryBean> versionhistory;
        private java.util.List<Post.LinksBean.CuriesBean> curies;

        public List<Post.LinksBean.SelfBean> getSelf() {
            return self;
        }

        public void setSelf(List<Post.LinksBean.SelfBean> self) {
            this.self = self;
        }

        public List<Post.LinksBean.CollectionBean> getCollection() {
            return collection;
        }

        public void setCollection(List<Post.LinksBean.CollectionBean> collection) {
            this.collection = collection;
        }

        public List<Post.LinksBean.AboutBean> getAbout() {
            return about;
        }

        public void setAbout(List<Post.LinksBean.AboutBean> about) {
            this.about = about;
        }

        public List<Post.LinksBean.AuthorBean> getAuthor() {
            return author;
        }

        public void setAuthor(List<Post.LinksBean.AuthorBean> author) {
            this.author = author;
        }

        public List<Post.LinksBean.RepliesBean> getReplies() {
            return replies;
        }

        public void setReplies(List<Post.LinksBean.RepliesBean> replies) {
            this.replies = replies;
        }

        public List<Post.LinksBean.VersionhistoryBean> getVersionhistory() {
            return versionhistory;
        }

        public void setVersionhistory(List<Post.LinksBean.VersionhistoryBean> versionhistory) {
            this.versionhistory = versionhistory;
        }

        public static class SelfBean {
            /**
             * href : http://cwbeta.risinfo.cn/wp-json/wp/v2/posts/56
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class CollectionBean {
            /**
             * href : http://cwbeta.risinfo.cn/wp-json/wp/v2/posts
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class AboutBean {
            /**
             * href : http://cwbeta.risinfo.cn/wp-json/wp/v2/types/post
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class AuthorBean {
            /**
             * embeddable : true
             * href : http://cwbeta.risinfo.cn/wp-json/wp/v2/users/1
             */

            private boolean embeddable;
            private String href;

            public boolean isEmbeddable() {
                return embeddable;
            }

            public void setEmbeddable(boolean embeddable) {
                this.embeddable = embeddable;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class RepliesBean {
            /**
             * embeddable : true
             * href : http://cwbeta.risinfo.cn/wp-json/wp/v2/comments?post=56
             */

            private boolean embeddable;
            private String href;

            public boolean isEmbeddable() {
                return embeddable;
            }

            public void setEmbeddable(boolean embeddable) {
                this.embeddable = embeddable;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class VersionhistoryBean {
            /**
             * href : http://cwbeta.risinfo.cn/wp-json/wp/v2/posts/56/revisions
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }


        public static class CuriesBean {
            /**
             * name : wp
             * href : https://api.w.org/{rel}
             * templated : true
             */

            private String name;
            private String href;
            private boolean templated;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public boolean isTemplated() {
                return templated;
            }

            public void setTemplated(boolean templated) {
                this.templated = templated;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public void setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
    }

    public GuidBean getGuid() {
        return guid;
    }

    public void setGuid(GuidBean guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public void setModified_gmt(String modified_gmt) {
        this.modified_gmt = modified_gmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public TitleBean getTitle() {
        return title;
    }

    public void setTitle(TitleBean title) {
        this.title = title;
    }

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public ExcerptBean getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(ExcerptBean excerpt) {
        this.excerpt = excerpt;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getFeatured_media() {
        return featured_media;
    }

    public void setFeatured_media(int featured_media) {
        this.featured_media = featured_media;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public String getPing_status() {
        return ping_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public LinksBean get_links() {
        return _links;
    }

    public void set_links(LinksBean _links) {
        this._links = _links;
    }

    public List<?> getMeta() {
        return meta;
    }

    public void setMeta(List<?> meta) {
        this.meta = meta;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<?> getTags() {
        return tags;
    }

    public void setTags(List<?> tags) {
        this.tags = tags;
    }
}
