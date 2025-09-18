package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: XA */
/* loaded from: classes.dex */
public final class C1458XA {

    /* renamed from: e */
    public static final Charset f13584e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final int f13585f = 15;

    /* renamed from: g */
    public static final C1395WA f13586g = new C1395WA();

    /* renamed from: h */
    public static final C0295Eg f13587h = new C0295Eg(4);

    /* renamed from: i */
    public static final C4225iA f13588i = new C4225iA(2);

    /* renamed from: a */
    public final AtomicInteger f13589a = new AtomicInteger(0);

    /* renamed from: b */
    public final C0471HT f13590b;

    /* renamed from: c */
    public final C1361Vd f13591c;

    /* renamed from: d */
    public final C6220jA f13592d;

    public C1458XA(C0471HT c0471ht, C1361Vd c1361Vd, C6220jA c6220jA) {
        this.f13590b = c0471ht;
        this.f13591c = c1361Vd;
        this.f13592d = c6220jA;
    }

    /* renamed from: a */
    public static void m8939a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: e */
    public static String m8940e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f13584e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static void m8941f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13584e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final ArrayList m8942b() {
        ArrayList arrayList = new ArrayList();
        C0471HT c0471ht = this.f13590b;
        arrayList.addAll(C0471HT.m3439m(((File) c0471ht.f4314f).listFiles()));
        arrayList.addAll(C0471HT.m3439m(((File) c0471ht.f4315g).listFiles()));
        C0295Eg c0295Eg = f13587h;
        Collections.sort(arrayList, c0295Eg);
        List listM3439m = C0471HT.m3439m(((File) c0471ht.f4313e).listFiles());
        Collections.sort(listM3439m, c0295Eg);
        arrayList.addAll(listM3439m);
        return arrayList;
    }

    /* renamed from: c */
    public final NavigableSet m8943c() {
        return new TreeSet(C0471HT.m3439m(((File) this.f13590b.f4312d).list())).descendingSet();
    }

    /* renamed from: d */
    public final void m8944d(AbstractC0955PA abstractC0955PA, String str, boolean z) {
        C0471HT c0471ht = this.f13590b;
        C3979eG c3979eG = this.f13591c.m8521g().f904a;
        f13586g.getClass();
        try {
            m8941f(c0471ht.m3450j(str, AbstractC7222ym.m26234k("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f13589a.getAndIncrement())), z ? "_" : "")), C1395WA.f13016a.m6779v(abstractC0955PA));
        } catch (IOException unused) {
        }
        C4225iA c4225iA = new C4225iA(3);
        c0471ht.getClass();
        File file = new File((File) c0471ht.f4312d, str);
        file.mkdirs();
        List<File> listM3439m = C0471HT.m3439m(file.listFiles(c4225iA));
        Collections.sort(listM3439m, new C0295Eg(5));
        int size = listM3439m.size();
        for (File file2 : listM3439m) {
            if (size <= c3979eG.f26623b) {
                return;
            }
            C0471HT.m3438l(file2);
            size--;
        }
    }
}
