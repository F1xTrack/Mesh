package com.vk.push.core.deviceid.contentprovider;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import defpackage.F71;
import defpackage.LB;
import defpackage.O90;
import defpackage.X2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/deviceid/contentprovider/DeviceIdUriMatcher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LTf1;", "init", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "", "match", "(Landroid/net/Uri;)Z", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdUriMatcher {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final F71 a = LB.b(X2.u);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/vk/push/core/deviceid/contentprovider/DeviceIdUriMatcher$Companion;", "", "", "packageName", "getAuthority", "(Ljava/lang/String;)Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "", "getCode", "()I", "getVirtualColumnName", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final String getAuthority(String packageName) {
            O90.f(packageName, "packageName");
            return packageName.concat(".VkpnsDeviceIdContentProvider");
        }

        public final int getCode() {
            return 1;
        }

        public final String getPath() {
            return CommonUrlParts.DEVICE_ID;
        }

        public final String getVirtualColumnName() {
            return "device_id_column";
        }
    }

    public final void init(Context context) {
        O90.f(context, "context");
        UriMatcher uriMatcher = (UriMatcher) this.a.getValue();
        Companion companion = INSTANCE;
        String packageName = context.getPackageName();
        O90.e(packageName, "context.packageName");
        uriMatcher.addURI(companion.getAuthority(packageName), companion.getPath(), companion.getCode());
    }

    public final boolean match(Uri uri) {
        O90.f(uri, "uri");
        return ((UriMatcher) this.a.getValue()).match(uri) == INSTANCE.getCode();
    }
}
