package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: dD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3348dD {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public final C3538eD a() {
        YN1.i(this.a, "The uri must be set.");
        return new C3538eD(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
