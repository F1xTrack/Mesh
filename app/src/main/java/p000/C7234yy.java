package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: yy */
/* loaded from: classes.dex */
public final class C7234yy implements InterfaceC7171xy, InterfaceC7297zy {

    /* renamed from: a */
    public final /* synthetic */ int f46551a = 0;

    /* renamed from: b */
    public ClipData f46552b;

    /* renamed from: c */
    public int f46553c;

    /* renamed from: d */
    public int f46554d;

    /* renamed from: e */
    public Uri f46555e;

    /* renamed from: f */
    public Bundle f46556f;

    public /* synthetic */ C7234yy() {
    }

    @Override // p000.InterfaceC7171xy
    /* renamed from: J */
    public void mo17847J(Uri uri) {
        this.f46555e = uri;
    }

    @Override // p000.InterfaceC7171xy
    /* renamed from: P */
    public void mo17852P(int i) {
        this.f46554d = i;
    }

    @Override // p000.InterfaceC7171xy
    /* renamed from: a */
    public C0061Ay mo17858a() {
        return new C0061Ay(new C7234yy(this));
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: b */
    public ClipData mo860b() {
        return this.f46552b;
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: e */
    public int mo862e() {
        return this.f46553c;
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: i */
    public int mo865i() {
        return this.f46554d;
    }

    @Override // p000.InterfaceC7297zy
    /* renamed from: j */
    public ContentInfo mo866j() {
        return null;
    }

    @Override // p000.InterfaceC7171xy
    public void setExtras(Bundle bundle) {
        this.f46556f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f46551a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f46552b.getDescription());
                sb.append(", source=");
                int i = this.f46553c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f46554d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = this.f46555e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC1374Vq.m8593l(sb, this.f46556f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C7234yy(C7234yy c7234yy) {
        ClipData clipData = c7234yy.f46552b;
        clipData.getClass();
        this.f46552b = clipData;
        int i = c7234yy.f46553c;
        AbstractC9104dM1.m17547f(i, 0, 5, "source");
        this.f46553c = i;
        int i2 = c7234yy.f46554d;
        if ((i2 & 1) == i2) {
            this.f46554d = i2;
            this.f46555e = c7234yy.f46555e;
            this.f46556f = c7234yy.f46556f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
