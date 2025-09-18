package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: ba */
/* loaded from: classes.dex */
public final class C1794ba extends ContentObserver {

    /* renamed from: a */
    public final ContentResolver f17074a;

    /* renamed from: b */
    public final Uri f17075b;

    /* renamed from: c */
    public final /* synthetic */ C1856ca f17076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1794ba(C1856ca c1856ca, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f17076c = c1856ca;
        this.f17074a = contentResolver;
        this.f17075b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C1856ca c1856ca = this.f17076c;
        c1856ca.m10789a(C1520Y9.m9223b((Context) c1856ca.f17605b, (C1017Q9) c1856ca.f17613j, (C3999ea) c1856ca.f17612i));
    }
}
