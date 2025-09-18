package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Attribution implements Serializable {
    private Author author;
    private Link link;

    public Attribution(Author author, Link link) {
        this.author = author;
        this.link = link;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Link getLink() {
        return this.link;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.author = (Author) archive.add((Archive) this.author, true, (Class<Archive>) Author.class);
        this.link = (Link) archive.add((Archive) this.link, true, (Class<Archive>) Link.class);
    }

    public static class Link implements Serializable {
        private String href;

        public Link(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Required field \"href\" cannot be null");
            }
            this.href = str;
        }

        public String getHref() {
            return this.href;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.href = archive.add(this.href, false);
        }

        public Link() {
        }
    }

    public Attribution() {
    }

    public static class Author implements Serializable {
        private String email;
        private String name;
        private String uri;

        public Author(String str, String str2, String str3) {
            if (str == null) {
                throw new IllegalArgumentException("Required field \"name\" cannot be null");
            }
            this.name = str;
            this.uri = str2;
            this.email = str3;
        }

        public String getEmail() {
            return this.email;
        }

        public String getName() {
            return this.name;
        }

        public String getUri() {
            return this.uri;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.name = archive.add(this.name, false);
            this.uri = archive.add(this.uri, true);
            this.email = archive.add(this.email, true);
        }

        public Author() {
        }
    }
}
