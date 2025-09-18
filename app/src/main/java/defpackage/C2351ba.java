package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351ba extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ C2541ca c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2351ba(C2541ca c2541ca, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = c2541ca;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C2541ca c2541ca = this.c;
        c2541ca.a(Y9.b((Context) c2541ca.b, (Q9) c2541ca.j, (C3607ea) c2541ca.i));
    }
}
