package ru.ok.tracer.base.http;

import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.AbstractC3557eJ0;
import defpackage.AbstractC8069xu;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.http.HttpRequestBody;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ok/tracer/base/http/HttpMultipartBodyBuilder;", "", "()V", "parts", "", "Lru/ok/tracer/base/http/HttpPart;", "add", "name", "", "filename", "body", "Lru/ok/tracer/base/http/HttpRequestBody;", "addString", RemoteMessageConst.Notification.CONTENT, "build", "Companion", "tracer-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpMultipartBodyBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<HttpPart> parts = new ArrayList();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/base/http/HttpMultipartBodyBuilder$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ok/tracer/base/http/HttpMultipartBodyBuilder;", "LTf1;", "block", "Lru/ok/tracer/base/http/HttpRequestBody;", "build", "(LnZ;)Lru/ok/tracer/base/http/HttpRequestBody;", "tracer-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HttpRequestBody build(InterfaceC6099nZ block) {
            O90.f(block, "block");
            HttpMultipartBodyBuilder httpMultipartBodyBuilder = new HttpMultipartBodyBuilder();
            block.invoke(httpMultipartBodyBuilder);
            return httpMultipartBodyBuilder.build();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ HttpMultipartBodyBuilder add$default(HttpMultipartBodyBuilder httpMultipartBodyBuilder, String str, String str2, HttpRequestBody httpRequestBody, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return httpMultipartBodyBuilder.add(str, str2, httpRequestBody);
    }

    public final HttpMultipartBodyBuilder add(String name, String filename, HttpRequestBody body) {
        O90.f(name, "name");
        O90.f(body, "body");
        this.parts.add(new HttpPart(name, filename, body.getContentType(), body));
        return this;
    }

    public final HttpMultipartBodyBuilder addString(String name, String str) {
        O90.f(name, "name");
        O90.f(str, RemoteMessageConst.Notification.CONTENT);
        this.parts.add(new HttpPart(name, null, null, HttpRequestBody.Companion.fromString$default(HttpRequestBody.INSTANCE, "text/plain", str, null, 4, null), 6, null));
        return this;
    }

    public final HttpRequestBody build() {
        AbstractC3557eJ0.a.getClass();
        return new HttpMultipartBody(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(AbstractC3557eJ0.b.d())}, 1)), AbstractC8069xu.b0(this.parts));
    }
}
