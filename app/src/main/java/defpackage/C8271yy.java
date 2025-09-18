package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: yy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8271yy implements InterfaceC8081xy, InterfaceC8461zy {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public /* synthetic */ C8271yy() {
    }

    @Override // defpackage.InterfaceC8081xy
    public void J(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.InterfaceC8081xy
    public void P(int i) {
        this.d = i;
    }

    @Override // defpackage.InterfaceC8081xy
    public C0092Ay a() {
        return new C0092Ay(new C8271yy(this));
    }

    @Override // defpackage.InterfaceC8461zy
    public ClipData b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC8461zy
    public int e() {
        return this.c;
    }

    @Override // defpackage.InterfaceC8461zy
    public int i() {
        return this.d;
    }

    @Override // defpackage.InterfaceC8461zy
    public ContentInfo j() {
        return null;
    }

    @Override // defpackage.InterfaceC8081xy
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = this.e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC1705Vq.l(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C8271yy(C8271yy c8271yy) {
        ClipData clipData = c8271yy.b;
        clipData.getClass();
        this.b = clipData;
        int i = c8271yy.c;
        AbstractC3377dM1.f(i, 0, 5, "source");
        this.c = i;
        int i2 = c8271yy.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = c8271yy.e;
            this.f = c8271yy.f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
