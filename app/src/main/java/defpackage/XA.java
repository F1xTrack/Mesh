package defpackage;

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

/* loaded from: classes.dex */
public final class XA {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final WA g = new WA();
    public static final C0350Eg h = new C0350Eg(4);
    public static final C4293iA i = new C4293iA(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final HT b;
    public final C1666Vd c;
    public final C5260jA d;

    public XA(HT ht, C1666Vd c1666Vd, C5260jA c5260jA) {
        this.b = ht;
        this.c = c1666Vd;
        this.d = c5260jA;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
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

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
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

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        HT ht = this.b;
        arrayList.addAll(HT.m(((File) ht.f).listFiles()));
        arrayList.addAll(HT.m(((File) ht.g).listFiles()));
        C0350Eg c0350Eg = h;
        Collections.sort(arrayList, c0350Eg);
        List listM = HT.m(((File) ht.e).listFiles());
        Collections.sort(listM, c0350Eg);
        arrayList.addAll(listM);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(HT.m(((File) this.b.d).list())).descendingSet();
    }

    public final void d(PA pa, String str, boolean z) {
        HT ht = this.b;
        C3547eG c3547eG = this.c.g().a;
        g.getClass();
        try {
            f(ht.j(str, AbstractC8235ym.k("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), WA.a.v(pa));
        } catch (IOException unused) {
        }
        C4293iA c4293iA = new C4293iA(3);
        ht.getClass();
        File file = new File((File) ht.d, str);
        file.mkdirs();
        List<File> listM = HT.m(file.listFiles(c4293iA));
        Collections.sort(listM, new C0350Eg(5));
        int size = listM.size();
        for (File file2 : listM) {
            if (size <= c3547eG.b) {
                return;
            }
            HT.l(file2);
            size--;
        }
    }
}
