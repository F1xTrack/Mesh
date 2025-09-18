package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: cm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2578cm0 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static C7475um0 a(final String str, Callable callable, Runnable runnable) {
        C1847Xl0 c1847Xl0A = str == null ? null : C1925Yl0.b.a(str);
        C7475um0 c7475um0 = c1847Xl0A != null ? new C7475um0(c1847Xl0A) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            c7475um0 = (C7475um0) map.get(str);
        }
        if (c7475um0 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c7475um0;
        }
        C7475um0 c7475um02 = new C7475um0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            c7475um02.b(new InterfaceC6712qm0() { // from class: am0
                @Override // defpackage.InterfaceC6712qm0
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap map2 = AbstractC2578cm0.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC2578cm0.i();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC2578cm0.a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC2578cm0.i();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            c7475um02.a(new InterfaceC6712qm0() { // from class: am0
                @Override // defpackage.InterfaceC6712qm0
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            HashMap map2 = AbstractC2578cm0.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC2578cm0.i();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC2578cm0.a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC2578cm0.i();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c7475um02);
                if (map.size() == 1) {
                    i();
                }
            }
        }
        return c7475um02;
    }

    public static C7093sm0 b(Context context, String str, String str2) {
        C1847Xl0 c1847Xl0A = str2 == null ? null : C1925Yl0.b.a(str2);
        if (c1847Xl0A != null) {
            return new C7093sm0(c1847Xl0A);
        }
        try {
            C8351zN0 c8351zN0B = JI1.b(JI1.g(context.getAssets().open(str)));
            if (h(c8351zN0B, c).booleanValue()) {
                return f(context, new ZipInputStream(new C5747lj(c8351zN0B, 1)), str2);
            }
            if (h(c8351zN0B, d).booleanValue()) {
                return c(new GZIPInputStream(new C5747lj(c8351zN0B, 1)), str2);
            }
            String[] strArr = AbstractC8396zc0.e;
            return d(new C0573Hc0(c8351zN0B), str2, true);
        } catch (IOException e) {
            return new C7093sm0(e);
        }
    }

    public static C7093sm0 c(InputStream inputStream, String str) {
        C8351zN0 c8351zN0B = JI1.b(JI1.g(inputStream));
        String[] strArr = AbstractC8396zc0.e;
        return d(new C0573Hc0(c8351zN0B), str, true);
    }

    public static C7093sm0 d(C0573Hc0 c0573Hc0, String str, boolean z) throws IOException {
        C1847Xl0 c1847Xl0A;
        try {
            if (str == null) {
                c1847Xl0A = null;
            } else {
                try {
                    c1847Xl0A = C1925Yl0.b.a(str);
                } catch (Exception e) {
                    C7093sm0 c7093sm0 = new C7093sm0(e);
                    if (z) {
                        AbstractC0667Ih1.b(c0573Hc0);
                    }
                    return c7093sm0;
                }
            }
            if (c1847Xl0A != null) {
                C7093sm0 c7093sm02 = new C7093sm0(c1847Xl0A);
                if (z) {
                    AbstractC0667Ih1.b(c0573Hc0);
                }
                return c7093sm02;
            }
            C1847Xl0 c1847Xl0A2 = AbstractC3454dm0.a(c0573Hc0);
            if (str != null) {
                C1925Yl0.b.a.f(str, c1847Xl0A2);
            }
            C7093sm0 c7093sm03 = new C7093sm0(c1847Xl0A2);
            if (z) {
                AbstractC0667Ih1.b(c0573Hc0);
            }
            return c7093sm03;
        } catch (Throwable th) {
            if (z) {
                AbstractC0667Ih1.b(c0573Hc0);
            }
            throw th;
        }
    }

    public static C7093sm0 e(Context context, int i, String str) {
        C1847Xl0 c1847Xl0A = str == null ? null : C1925Yl0.b.a(str);
        if (c1847Xl0A != null) {
            return new C7093sm0(c1847Xl0A);
        }
        try {
            C8351zN0 c8351zN0B = JI1.b(JI1.g(context.getResources().openRawResource(i)));
            if (h(c8351zN0B, c).booleanValue()) {
                return f(context, new ZipInputStream(new C5747lj(c8351zN0B, 1)), str);
            }
            if (!h(c8351zN0B, d).booleanValue()) {
                String[] strArr = AbstractC8396zc0.e;
                return d(new C0573Hc0(c8351zN0B), str, true);
            }
            try {
                return c(new GZIPInputStream(new C5747lj(c8351zN0B, 1)), str);
            } catch (IOException e) {
                return new C7093sm0(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new C7093sm0(e2);
        }
    }

    public static C7093sm0 f(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return g(context, zipInputStream, str);
        } finally {
            AbstractC0667Ih1.b(zipInputStream);
        }
    }

    public static C7093sm0 g(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        C1847Xl0 c1847Xl0A;
        C6521pm0 c6521pm0;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c1847Xl0A = null;
        } else {
            try {
                c1847Xl0A = C1925Yl0.b.a(str);
            } catch (IOException e) {
                return new C7093sm0(e);
            }
        }
        if (c1847Xl0A != null) {
            return new C7093sm0(c1847Xl0A);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C1847Xl0 c1847Xl0 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                C8351zN0 c8351zN0B = JI1.b(JI1.g(zipInputStream));
                String[] strArr = AbstractC8396zc0.e;
                c1847Xl0 = d(new C0573Hc0(c8351zN0B), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C7093sm0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    AbstractC7281tl0.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    AbstractC7281tl0.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c1847Xl0 == null) {
            return new C7093sm0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c1847Xl0.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c6521pm0 = null;
                    break;
                }
                c6521pm0 = (C6521pm0) it.next();
                if (c6521pm0.d.equals(str4)) {
                    break;
                }
            }
            if (c6521pm0 != null) {
                c6521pm0.f = AbstractC0667Ih1.d((Bitmap) entry.getValue(), c6521pm0.a, c6521pm0.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (RW rw : c1847Xl0.f.values()) {
                if (rw.a.equals(entry2.getKey())) {
                    rw.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                AbstractC7281tl0.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c1847Xl0.c()).entrySet().iterator();
            while (it2.hasNext()) {
                C6521pm0 c6521pm02 = (C6521pm0) ((Map.Entry) it2.next()).getValue();
                if (c6521pm02 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = c6521pm02.d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        c6521pm02.f = AbstractC0667Ih1.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), c6521pm02.a, c6521pm02.b);
                    } catch (IllegalArgumentException e2) {
                        AbstractC7281tl0.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C1925Yl0.b.a.f(str, c1847Xl0);
        }
        return new C7093sm0(c1847Xl0);
    }

    public static Boolean h(C8351zN0 c8351zN0, byte[] bArr) {
        try {
            C8351zN0 c8351zN0B = JI1.b(new AA0(c8351zN0));
            for (byte b2 : bArr) {
                if (c8351zN0B.p() != b2) {
                    return Boolean.FALSE;
                }
            }
            c8351zN0B.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            AbstractC7281tl0.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String j(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
