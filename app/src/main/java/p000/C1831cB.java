package p000;

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

/* renamed from: cB */
/* loaded from: classes.dex */
public final class C1831cB {

    /* renamed from: d */
    public static final Charset f17345d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f17346a;

    /* renamed from: b */
    public final InterfaceC9939ju0 f17347b;

    /* renamed from: c */
    public final C0471HT f17348c;

    public C1831cB(Context context, InterfaceC9939ju0 interfaceC9939ju0, C0471HT c0471ht) {
        this.f17346a = context;
        this.f17347b = interfaceC9939ju0;
        this.f17348c = c0471ht;
    }

    /* renamed from: a */
    public static String m10609a(InputStream inputStream) throws IOException {
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

    /* renamed from: c */
    public static File m10610c(File file, String str) {
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

    /* renamed from: g */
    public static void m10611g(C0471HT c0471ht, String str, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        File file = new File(c0471ht.m3449i(str), str3);
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f17345d));
        } catch (IOException unused) {
        } catch (Throwable th2) {
            bufferedWriter = null;
            th = th2;
        }
        try {
            bufferedWriter.write(str2);
            file.toString();
            AbstractC1378Vu.m8619d(bufferedWriter);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            file.toString();
            AbstractC1378Vu.m8619d(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            file.toString();
            AbstractC1378Vu.m8619d(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: b */
    public final C8128Pr0 m10612b(String str) {
        C0471HT c0471ht = this.f17348c;
        File fileM3449i = c0471ht.m3449i(str);
        File file = new File(fileM3449i, "pending");
        file.getAbsolutePath();
        File fileM10610c = m10610c(file, ".dmp");
        if (fileM10610c != null) {
            fileM10610c.exists();
        }
        U41 u41 = new U41();
        if (fileM3449i.exists() && file.exists()) {
            File fileM10610c2 = m10610c(file, ".dmp");
            C0794Mc c0794McM5031a = null;
            String strM10609a = null;
            c0794McM5031a = null;
            if (Build.VERSION.SDK_INT >= 31) {
                List historicalProcessExitReasons = ((ActivityManager) this.f17346a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                long jLastModified = c0471ht.m3450j(str, "start-time").lastModified();
                ArrayList arrayList = new ArrayList();
                Iterator it = historicalProcessExitReasons.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoM3701f = AbstractC0506I1.m3701f(it.next());
                    if (applicationExitInfoM3701f.getReason() == 5 && applicationExitInfoM3701f.getTimestamp() >= jLastModified) {
                        arrayList.add(applicationExitInfoM3701f);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ApplicationExitInfo applicationExitInfoM3701f2 = AbstractC0506I1.m3701f(arrayList.get(0));
                    C0731Lc c0731Lc = new C0731Lc();
                    c0731Lc.f6752d = applicationExitInfoM3701f2.getImportance();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 4);
                    String processName = applicationExitInfoM3701f2.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0731Lc.f6750b = processName;
                    c0731Lc.f6751c = applicationExitInfoM3701f2.getReason();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 2);
                    c0731Lc.f6755g = applicationExitInfoM3701f2.getTimestamp();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 32);
                    c0731Lc.f6749a = applicationExitInfoM3701f2.getPid();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 1);
                    c0731Lc.f6753e = applicationExitInfoM3701f2.getPss();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 8);
                    c0731Lc.f6754f = applicationExitInfoM3701f2.getRss();
                    c0731Lc.f6758j = (byte) (c0731Lc.f6758j | 16);
                    try {
                        strM10609a = m10609a(applicationExitInfoM3701f2.getTraceInputStream());
                    } catch (IOException unused) {
                    }
                    c0731Lc.f6756h = strM10609a;
                    c0794McM5031a = c0731Lc.m5031a();
                }
            }
            u41.f11644a = new CC0(fileM10610c2, 25, c0794McM5031a);
            u41.f11645b = m10610c(fileM3449i, ".device_info");
            u41.f11646c = new File(fileM3449i, "session.json");
            u41.f11647d = new File(fileM3449i, "app.json");
            u41.f11648e = new File(fileM3449i, "device.json");
            u41.f11649f = new File(fileM3449i, "os.json");
        }
        C8128Pr0 c8128Pr0 = new C8128Pr0();
        c8128Pr0.f9303a = (CC0) u41.f11644a;
        c8128Pr0.f9304b = (File) u41.f11645b;
        c8128Pr0.f9305c = (File) u41.f11646c;
        c8128Pr0.f9306d = (File) u41.f11647d;
        c8128Pr0.f9307e = (File) u41.f11648e;
        c8128Pr0.f9308f = (File) u41.f11649f;
        return c8128Pr0;
    }

    /* renamed from: d */
    public final void m10613d(long j, String str) throws Throwable {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", "Crashlytics Android SDK/19.4.0");
        map.put("started_at_seconds", Long.valueOf(j));
        m10611g(this.f17348c, str, new JSONObject(map).toString(), "session.json");
    }

    /* renamed from: e */
    public final void m10614e(String str, C0167Ce c0167Ce) throws Throwable {
        C0827N8 c0827n8 = c0167Ce.f1536f;
        String str2 = c0827n8.m5564r().f47104b;
        String str3 = c0827n8.m5564r().f47105c;
        HashMap map = new HashMap();
        map.put("app_identifier", c0167Ce.f1531a);
        map.put("version_code", c0167Ce.f1532b);
        map.put("version_name", c0167Ce.f1533c);
        map.put("install_uuid", c0167Ce.f1534d);
        map.put("delivery_mechanism", Integer.valueOf(c0167Ce.f1535e));
        if (str2 == null) {
            str2 = "";
        }
        map.put("development_platform", str2);
        if (str3 == null) {
            str3 = "";
        }
        map.put("development_platform_version", str3);
        m10611g(this.f17348c, str, new JSONObject(map).toString(), "app.json");
    }

    /* renamed from: f */
    public final void m10615f(String str, C0230De c0230De) throws Throwable {
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(c0230De.f2119a));
        map.put("build_model", c0230De.f2120b);
        map.put("available_processors", Integer.valueOf(c0230De.f2121c));
        map.put("total_ram", Long.valueOf(c0230De.f2122d));
        map.put("disk_space", Long.valueOf(c0230De.f2123e));
        map.put("is_emulator", Boolean.valueOf(c0230De.f2124f));
        map.put("state", Integer.valueOf(c0230De.f2125g));
        map.put("build_manufacturer", c0230De.f2126h);
        map.put("build_product", c0230De.f2127i);
        m10611g(this.f17348c, str, new JSONObject(map).toString(), "device.json");
    }

    /* renamed from: h */
    public final void m10616h(String str, C0293Ee c0293Ee) throws Throwable {
        HashMap map = new HashMap();
        map.put("version", c0293Ee.f2815a);
        map.put("build_version", c0293Ee.f2816b);
        map.put(CommonUrlParts.ROOT_STATUS, Boolean.valueOf(c0293Ee.f2817c));
        m10611g(this.f17348c, str, new JSONObject(map).toString(), "os.json");
    }
}
