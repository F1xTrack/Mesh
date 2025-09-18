package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* renamed from: mK */
/* loaded from: classes2.dex */
public final class C6419mK {

    /* renamed from: a */
    public final String f37627a;

    /* renamed from: b */
    public final long[] f37628b;

    /* renamed from: c */
    public final ArrayList f37629c;

    /* renamed from: d */
    public final ArrayList f37630d;

    /* renamed from: e */
    public boolean f37631e;

    /* renamed from: f */
    public boolean f37632f;

    /* renamed from: g */
    public C1338VG f37633g;

    /* renamed from: h */
    public int f37634h;

    /* renamed from: i */
    public long f37635i;

    /* renamed from: j */
    public final /* synthetic */ C6673qK f37636j;

    public C6419mK(C6673qK c6673qK, String str) {
        O90.m5968f(str, "key");
        this.f37636j = c6673qK;
        this.f37627a = str;
        c6673qK.getClass();
        this.f37628b = new long[2];
        this.f37629c = new ArrayList();
        this.f37630d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f37629c.add(new File(this.f37636j.f40776a, sb.toString()));
            sb.append(".tmp");
            this.f37630d.add(new File(this.f37636j.f40776a, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [lK] */
    /* renamed from: a */
    public final C6545oK m22771a() throws IOException {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        if (!this.f37631e) {
            return null;
        }
        C6673qK c6673qK = this.f37636j;
        if (!c6673qK.f40786k && (this.f37633g != null || this.f37632f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f37628b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                File file = (File) this.f37629c.get(i);
                O90.m5968f(file, "file");
                Logger logger = AbstractC11608wx0.f45176a;
                C6931u9 c6931u9 = new C6931u9(new FileInputStream(file), C7523Ea1.f2789d);
                if (!c6673qK.f40786k) {
                    this.f37634h++;
                    c6931u9 = new C6356lK(c6931u9, c6673qK, this);
                }
                arrayList.add(c6931u9);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC7433Ch1.m1275d((U21) it.next());
                }
                try {
                    c6673qK.m23971W(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
        return new C6545oK(this.f37636j, this.f37627a, this.f37635i, arrayList, jArr);
    }
}
