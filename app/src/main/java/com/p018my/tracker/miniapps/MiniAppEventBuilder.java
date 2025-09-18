package com.p018my.tracker.miniapps;

import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class MiniAppEventBuilder {

    /* renamed from: a */
    final int f19700a;

    /* renamed from: b */
    final String f19701b;

    /* renamed from: c */
    final String f19702c;

    /* renamed from: d */
    String f19703d;

    /* renamed from: e */
    String f19704e;

    /* renamed from: f */
    String f19705f;

    /* renamed from: g */
    Map f19706g;

    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        public CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        public CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f19705f = str3;
        }

        public CustomEventBuilder withCustomUserId(String str) {
            this.f19704e = str;
            return this;
        }

        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.f19706g = map;
            return this;
        }
    }

    public static final class EventBuilder {

        /* renamed from: a */
        final String f19707a;

        /* renamed from: b */
        final String f19708b;

        public EventBuilder(String str, String str2) {
            this.f19707a = str;
            this.f19708b = str2;
        }

        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f19707a, this.f19708b);
        }

        public CustomEventBuilder customEvent(String str) {
            return new CustomEventBuilder(this.f19707a, this.f19708b, str);
        }

        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f19707a, this.f19708b);
        }

        public OpenEventBuilder openEvent(String str) {
            return new OpenEventBuilder(this.f19707a, this.f19708b, str);
        }

        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f19707a, this.f19708b);
        }
    }

    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        public OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f19703d = str3;
        }
    }

    public static final class UserEventBuilder extends MiniAppEventBuilder {
        public UserEventBuilder(int i, String str, String str2) {
            super(i, str, str2);
        }

        public UserEventBuilder withCustomUserId(String str) {
            this.f19704e = str;
            return this;
        }
    }

    public MiniAppEventBuilder(int i, String str, String str2) {
        this.f19700a = i;
        this.f19701b = str;
        this.f19702c = str2;
    }

    public static EventBuilder newEventBuilder(String str, String str2) {
        return new EventBuilder(str, str2);
    }

    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f19700a, this.f19701b, this.f19702c, this.f19703d, this.f19704e, this.f19705f, this.f19706g == null ? null : new TreeMap(this.f19706g));
    }
}
