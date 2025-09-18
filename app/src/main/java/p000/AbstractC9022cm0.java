package p000;

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
public abstract class AbstractC9022cm0 {

    /* renamed from: a */
    public static final HashMap f17734a = new HashMap();

    /* renamed from: b */
    public static final HashSet f17735b = new HashSet();

    /* renamed from: c */
    public static final byte[] f17736c = {80, 75, 3, 4};

    /* renamed from: d */
    public static final byte[] f17737d = {31, -117, 8};

    /* renamed from: a */
    public static C11331um0 m10855a(final String str, Callable callable, Runnable runnable) {
        C8532Xl0 c8532Xl0M9353a = str == null ? null : C8584Yl0.f14503b.m9353a(str);
        C11331um0 c11331um0 = c8532Xl0M9353a != null ? new C11331um0(c8532Xl0M9353a) : null;
        HashMap map = f17734a;
        if (str != null && map.containsKey(str)) {
            c11331um0 = (C11331um0) map.get(str);
        }
        if (c11331um0 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c11331um0;
        }
        C11331um0 c11331um02 = new C11331um0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            c11331um02.m25233b(new InterfaceC10819qm0() { // from class: am0
                @Override // p000.InterfaceC10819qm0
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap map2 = AbstractC9022cm0.f17734a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC9022cm0.m10863i();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC9022cm0.f17734a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC9022cm0.m10863i();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            c11331um02.m25232a(new InterfaceC10819qm0() { // from class: am0
                @Override // p000.InterfaceC10819qm0
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            HashMap map2 = AbstractC9022cm0.f17734a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                AbstractC9022cm0.m10863i();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = AbstractC9022cm0.f17734a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                AbstractC9022cm0.m10863i();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, c11331um02);
                if (map.size() == 1) {
                    m10863i();
                }
            }
        }
        return c11331um02;
    }

    /* renamed from: b */
    public static C11075sm0 m10856b(Context context, String str, String str2) {
        C8532Xl0 c8532Xl0M9353a = str2 == null ? null : C8584Yl0.f14503b.m9353a(str2);
        if (c8532Xl0M9353a != null) {
            return new C11075sm0(c8532Xl0M9353a);
        }
        try {
            C11917zN0 c11917zN0M4274b = JI1.m4274b(JI1.m4279g(context.getAssets().open(str)));
            if (m10862h(c11917zN0M4274b, f17736c).booleanValue()) {
                return m10860f(context, new ZipInputStream(new C6381lj(c11917zN0M4274b, 1)), str2);
            }
            if (m10862h(c11917zN0M4274b, f17737d).booleanValue()) {
                return m10857c(new GZIPInputStream(new C6381lj(c11917zN0M4274b, 1)), str2);
            }
            String[] strArr = AbstractC11947zc0.f46891e;
            return m10858d(new C7682Hc0(c11917zN0M4274b), str2, true);
        } catch (IOException e) {
            return new C11075sm0(e);
        }
    }

    /* renamed from: c */
    public static C11075sm0 m10857c(InputStream inputStream, String str) {
        C11917zN0 c11917zN0M4274b = JI1.m4274b(JI1.m4279g(inputStream));
        String[] strArr = AbstractC11947zc0.f46891e;
        return m10858d(new C7682Hc0(c11917zN0M4274b), str, true);
    }

    /* renamed from: d */
    public static C11075sm0 m10858d(C7682Hc0 c7682Hc0, String str, boolean z) throws IOException {
        C8532Xl0 c8532Xl0M9353a;
        try {
            if (str == null) {
                c8532Xl0M9353a = null;
            } else {
                try {
                    c8532Xl0M9353a = C8584Yl0.f14503b.m9353a(str);
                } catch (Exception e) {
                    C11075sm0 c11075sm0 = new C11075sm0(e);
                    if (z) {
                        AbstractC7745Ih1.m3973b(c7682Hc0);
                    }
                    return c11075sm0;
                }
            }
            if (c8532Xl0M9353a != null) {
                C11075sm0 c11075sm02 = new C11075sm0(c8532Xl0M9353a);
                if (z) {
                    AbstractC7745Ih1.m3973b(c7682Hc0);
                }
                return c11075sm02;
            }
            C8532Xl0 c8532Xl0M17741a = AbstractC9155dm0.m17741a(c7682Hc0);
            if (str != null) {
                C8584Yl0.f14503b.f14504a.m4573f(str, c8532Xl0M17741a);
            }
            C11075sm0 c11075sm03 = new C11075sm0(c8532Xl0M17741a);
            if (z) {
                AbstractC7745Ih1.m3973b(c7682Hc0);
            }
            return c11075sm03;
        } catch (Throwable th) {
            if (z) {
                AbstractC7745Ih1.m3973b(c7682Hc0);
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static C11075sm0 m10859e(Context context, int i, String str) {
        C8532Xl0 c8532Xl0M9353a = str == null ? null : C8584Yl0.f14503b.m9353a(str);
        if (c8532Xl0M9353a != null) {
            return new C11075sm0(c8532Xl0M9353a);
        }
        try {
            C11917zN0 c11917zN0M4274b = JI1.m4274b(JI1.m4279g(context.getResources().openRawResource(i)));
            if (m10862h(c11917zN0M4274b, f17736c).booleanValue()) {
                return m10860f(context, new ZipInputStream(new C6381lj(c11917zN0M4274b, 1)), str);
            }
            if (!m10862h(c11917zN0M4274b, f17737d).booleanValue()) {
                String[] strArr = AbstractC11947zc0.f46891e;
                return m10858d(new C7682Hc0(c11917zN0M4274b), str, true);
            }
            try {
                return m10857c(new GZIPInputStream(new C6381lj(c11917zN0M4274b, 1)), str);
            } catch (IOException e) {
                return new C11075sm0(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new C11075sm0(e2);
        }
    }

    /* renamed from: f */
    public static C11075sm0 m10860f(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return m10861g(context, zipInputStream, str);
        } finally {
            AbstractC7745Ih1.m3973b(zipInputStream);
        }
    }

    /* renamed from: g */
    public static C11075sm0 m10861g(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        C8532Xl0 c8532Xl0M9353a;
        C10691pm0 c10691pm0;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c8532Xl0M9353a = null;
        } else {
            try {
                c8532Xl0M9353a = C8584Yl0.f14503b.m9353a(str);
            } catch (IOException e) {
                return new C11075sm0(e);
            }
        }
        if (c8532Xl0M9353a != null) {
            return new C11075sm0(c8532Xl0M9353a);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C8532Xl0 c8532Xl0 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                C11917zN0 c11917zN0M4274b = JI1.m4274b(JI1.m4279g(zipInputStream));
                String[] strArr = AbstractC11947zc0.f46891e;
                c8532Xl0 = m10858d(new C7682Hc0(c11917zN0M4274b), null, false).f42591a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C11075sm0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
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
                    AbstractC11201tl0.m24981c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    AbstractC11201tl0.m24980b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c8532Xl0 == null) {
            return new C11075sm0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c8532Xl0.m9112c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c10691pm0 = null;
                    break;
                }
                c10691pm0 = (C10691pm0) it.next();
                if (c10691pm0.f40389d.equals(str4)) {
                    break;
                }
            }
            if (c10691pm0 != null) {
                c10691pm0.f40391f = AbstractC7745Ih1.m3975d((Bitmap) entry.getValue(), c10691pm0.f40386a, c10691pm0.f40387b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (C1102RW c1102rw : c8532Xl0.f13952f.values()) {
                if (c1102rw.f10245a.equals(entry2.getKey())) {
                    c1102rw.f10248d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                AbstractC11201tl0.m24980b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c8532Xl0.m9112c()).entrySet().iterator();
            while (it2.hasNext()) {
                C10691pm0 c10691pm02 = (C10691pm0) ((Map.Entry) it2.next()).getValue();
                if (c10691pm02 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = c10691pm02.f40389d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        c10691pm02.f40391f = AbstractC7745Ih1.m3975d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), c10691pm02.f40386a, c10691pm02.f40387b);
                    } catch (IllegalArgumentException e2) {
                        AbstractC11201tl0.m24981c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C8584Yl0.f14503b.f14504a.m4573f(str, c8532Xl0);
        }
        return new C11075sm0(c8532Xl0);
    }

    /* renamed from: h */
    public static Boolean m10862h(C11917zN0 c11917zN0, byte[] bArr) {
        try {
            C11917zN0 c11917zN0M4274b = JI1.m4274b(new AA0(c11917zN0));
            for (byte b : bArr) {
                if (c11917zN0M4274b.m26390p() != b) {
                    return Boolean.FALSE;
                }
            }
            c11917zN0M4274b.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            AbstractC11201tl0.f43239a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: i */
    public static void m10863i() {
        ArrayList arrayList = new ArrayList(f17735b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* renamed from: j */
    public static String m10864j(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
