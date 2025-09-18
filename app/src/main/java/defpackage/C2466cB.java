package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: cB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2466cB {
    public static final Charset d = Charset.forName("UTF-8");
    public final Context a;
    public final InterfaceC5399ju0 b;
    public final HT c;

    public C2466cB(Context context, InterfaceC5399ju0 interfaceC5399ju0, HT ht) {
        this.a = context;
        this.b = interfaceC5399ju0;
        this.c = ht;
    }

    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(byteArray);
                        gZIPOutputStream.finish();
                        String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream2.toByteArray());
                        gZIPOutputStream.close();
                        byteArrayOutputStream2.close();
                        return strEncodeToString;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static File c(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void g(HT ht, String str, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        File file = new File(ht.i(str), str3);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), d));
        } catch (IOException unused) {
        } catch (Throwable th2) {
            bufferedWriter = null;
            th = th2;
        }
        try {
            bufferedWriter.write(str2);
            file.toString();
            AbstractC1717Vu.d(bufferedWriter);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            file.toString();
            AbstractC1717Vu.d(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            file.toString();
            AbstractC1717Vu.d(bufferedWriter);
            throw th;
        }
    }

    public final C1241Pr0 b(String str) {
        HT ht = this.c;
        File fileI = ht.i(str);
        File file = new File(fileI, "pending");
        file.getAbsolutePath();
        File fileC = c(file, ".dmp");
        if (fileC != null) {
            fileC.exists();
        }
        U41 u41 = new U41();
        if (fileI.exists() && file.exists()) {
            File fileC2 = c(file, ".dmp");
            C0961Mc c0961McA = null;
            String strA = null;
            c0961McA = null;
            if (Build.VERSION.SDK_INT >= 31) {
                List historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long jLastModified = ht.j(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoF = I1.f(it.next());
                    if (applicationExitInfoF.getReason() == 5 && applicationExitInfoF.getTimestamp() >= jLastModified) {
                        arrayList.add(applicationExitInfoF);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo applicationExitInfoF2 = I1.f(arrayList.get(0));
                    C0884Lc c0884Lc = new C0884Lc();
                    c0884Lc.d = applicationExitInfoF2.getImportance();
                    c0884Lc.j = (byte) (c0884Lc.j | 4);
                    String processName = applicationExitInfoF2.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0884Lc.b = processName;
                    c0884Lc.c = applicationExitInfoF2.getReason();
                    c0884Lc.j = (byte) (c0884Lc.j | 2);
                    c0884Lc.g = applicationExitInfoF2.getTimestamp();
                    c0884Lc.j = (byte) (c0884Lc.j | 32);
                    c0884Lc.a = applicationExitInfoF2.getPid();
                    c0884Lc.j = (byte) (c0884Lc.j | 1);
                    c0884Lc.e = applicationExitInfoF2.getPss();
                    c0884Lc.j = (byte) (c0884Lc.j | 8);
                    c0884Lc.f = applicationExitInfoF2.getRss();
                    c0884Lc.j = (byte) (c0884Lc.j | 16);
                    try {
                        strA = a(applicationExitInfoF2.getTraceInputStream());
                    } catch (IOException unused) {
                    }
                    c0884Lc.h = strA;
                    c0961McA = c0884Lc.a();
                }
            }
            u41.a = new CC0(fileC2, 25, c0961McA);
            u41.b = c(fileI, ".device_info");
            u41.c = new File(fileI, "session.json");
            u41.d = new File(fileI, "app.json");
            u41.e = new File(fileI, "device.json");
            u41.f = new File(fileI, "os.json");
        }
        C1241Pr0 c1241Pr0 = new C1241Pr0();
        c1241Pr0.a = (CC0) u41.a;
        c1241Pr0.b = (File) u41.b;
        c1241Pr0.c = (File) u41.c;
        c1241Pr0.d = (File) u41.d;
        c1241Pr0.e = (File) u41.e;
        c1241Pr0.f = (File) u41.f;
        return c1241Pr0;
    }

    public final void d(long j, String str) throws Throwable {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", "Crashlytics Android SDK/19.4.0");
        map.put("started_at_seconds", Long.valueOf(j));
        g(this.c, str, new JSONObject(map).toString(), "session.json");
    }

    public final void e(String str, C0188Ce c0188Ce) throws Throwable {
        N8 n8 = c0188Ce.f;
        String str2 = n8.r().b;
        String str3 = n8.r().c;
        HashMap map = new HashMap();
        map.put("app_identifier", c0188Ce.a);
        map.put("version_code", c0188Ce.b);
        map.put("version_name", c0188Ce.c);
        map.put("install_uuid", c0188Ce.d);
        map.put("delivery_mechanism", Integer.valueOf(c0188Ce.e));
        if (str2 == null) {
            str2 = "";
        }
        map.put("development_platform", str2);
        if (str3 == null) {
            str3 = "";
        }
        map.put("development_platform_version", str3);
        g(this.c, str, new JSONObject(map).toString(), "app.json");
    }

    public final void f(String str, C0266De c0266De) throws Throwable {
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(c0266De.a));
        map.put("build_model", c0266De.b);
        map.put("available_processors", Integer.valueOf(c0266De.c));
        map.put("total_ram", Long.valueOf(c0266De.d));
        map.put("disk_space", Long.valueOf(c0266De.e));
        map.put("is_emulator", Boolean.valueOf(c0266De.f));
        map.put("state", Integer.valueOf(c0266De.g));
        map.put("build_manufacturer", c0266De.h);
        map.put("build_product", c0266De.i);
        g(this.c, str, new JSONObject(map).toString(), "device.json");
    }

    public final void h(String str, C0344Ee c0344Ee) throws Throwable {
        HashMap map = new HashMap();
        map.put("version", c0344Ee.a);
        map.put("build_version", c0344Ee.b);
        map.put(CommonUrlParts.ROOT_STATUS, Boolean.valueOf(c0344Ee.c));
        g(this.c, str, new JSONObject(map).toString(), "os.json");
    }
}
