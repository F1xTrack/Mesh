package com.p019vk.push.core.deviceid.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.huawei.hms.actions.SearchIntents;
import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.core.deviceid.DeviceIdRepositoryProvider;
import kotlin.Metadata;
import p000.AbstractC0576J8;
import p000.AbstractC9366fP1;
import p000.C9668hm1;
import p000.F91;
import p000.O90;

@Metadata(m22266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m22267d2 = {"Lcom/vk/push/core/deviceid/contentprovider/VkpnsDeviceIdContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "onCreate", "()Z", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "p0", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "p1", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "p2", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "p3", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class VkpnsDeviceIdContentProvider extends ContentProvider {

    /* renamed from: a */
    public final DeviceIdUriMatcher f20376a = new DeviceIdUriMatcher();

    /* renamed from: b */
    public final DefaultLogger f20377b = new DefaultLogger("VkpnsDeviceIdContentProvider");

    @Override // android.content.ContentProvider
    public int delete(Uri p0, String p1, String[] p2) {
        O90.m5968f(p0, "p0");
        throw new UnsupportedOperationException("DeviceIdContentProvider delete is not supported!");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri p0) {
        O90.m5968f(p0, "p0");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri p0, ContentValues p1) {
        O90.m5968f(p0, "p0");
        throw new UnsupportedOperationException("DeviceIdContentProvider insert is not supported!");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) throws Throwable {
        O90.m5968f(uri, "uri");
        Context context = getContext();
        if (context == null) {
            throw new IllegalStateException("Cannot find context from the provider.");
        }
        DeviceIdUriMatcher deviceIdUriMatcher = this.f20376a;
        deviceIdUriMatcher.init(context);
        if (projection == null || !deviceIdUriMatcher.match(uri)) {
            throw new IllegalArgumentException(F91.m2538u("Wrong URI: ", uri, " or projection is null"));
        }
        MatrixCursor matrixCursor = new MatrixCursor(projection);
        if (AbstractC0576J8.m4178e(projection, DeviceIdUriMatcher.INSTANCE.getVirtualColumnName())) {
            DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
            Context context2 = getContext();
            if (context2 == null) {
                throw new IllegalStateException("Cannot find context from the provider.");
            }
            AbstractC9366fP1.m18231c(new C9668hm1(matrixCursor, deviceIdRepositoryProvider.initIfRequired(context2, this.f20377b), null));
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri p0, ContentValues p1, String p2, String[] p3) {
        O90.m5968f(p0, "p0");
        throw new UnsupportedOperationException("DeviceIdContentProvider update is not supported!");
    }
}
