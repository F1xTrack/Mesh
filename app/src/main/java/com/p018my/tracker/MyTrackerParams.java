package com.p018my.tracker;

import android.text.TextUtils;
import com.p018my.tracker.obfuscated.AbstractC2336l;
import com.p018my.tracker.obfuscated.C2298b3;
import com.p018my.tracker.obfuscated.InterfaceC2368t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class MyTrackerParams {

    /* renamed from: a */
    final List f19676a = new ArrayList();

    /* renamed from: b */
    final Object f19677b = new Object();

    /* renamed from: c */
    volatile C2298b3 f19678c = C2298b3.f19772j;

    /* renamed from: d */
    final Map f19679d = new ConcurrentHashMap();

    /* renamed from: e */
    volatile String f19680e = null;

    /* renamed from: f */
    volatile String f19681f = null;

    /* renamed from: g */
    volatile String f19682g = null;

    /* renamed from: h */
    volatile String f19683h = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    /* renamed from: com.my.tracker.MyTrackerParams$a */
    public static class C2285a {

        /* renamed from: a */
        public final String f19684a;

        /* renamed from: b */
        public final String f19685b;

        /* renamed from: c */
        public final String f19686c;

        /* renamed from: d */
        public final String f19687d;

        /* renamed from: e */
        public final Map f19688e;

        public C2285a(String str, String str2, String str3, String str4, Map map) {
            this.f19684a = str;
            this.f19685b = str2;
            this.f19686c = str3;
            this.f19687d = str4;
            this.f19688e = new HashMap(map);
        }
    }

    /* renamed from: b */
    private static String m12751b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    /* renamed from: a */
    public void m12753a(InterfaceC2368t interfaceC2368t, InterfaceC2368t interfaceC2368t2) {
        synchronized (this.f19677b) {
            synchronized (this.f19676a) {
                interfaceC2368t.mo7467a(this.f19678c);
                this.f19676a.add(interfaceC2368t2);
            }
        }
    }

    public int getAge() {
        return this.f19678c.f19773a;
    }

    public String getCustomParam(String str) {
        return (String) this.f19679d.get(str.toLowerCase(Locale.ROOT));
    }

    public String getCustomUserId() {
        return m12751b(this.f19678c.f19779g);
    }

    public String[] getCustomUserIds() {
        return m12750a(this.f19678c.f19779g);
    }

    public String getEmail() {
        return m12751b(this.f19678c.f19777e);
    }

    public String[] getEmails() {
        return m12750a(this.f19678c.f19777e);
    }

    public int getGender() {
        return this.f19678c.f19774b;
    }

    public String getIcqId() {
        return m12751b(this.f19678c.f19778f);
    }

    public String[] getIcqIds() {
        return m12750a(this.f19678c.f19778f);
    }

    public String getLang() {
        return this.f19680e;
    }

    public String getMrgsAppId() {
        return this.f19681f;
    }

    public String getMrgsId() {
        return this.f19683h;
    }

    public String getMrgsUserId() {
        return this.f19682g;
    }

    public String getOkId() {
        return m12751b(this.f19678c.f19775c);
    }

    public String[] getOkIds() {
        return m12750a(this.f19678c.f19775c);
    }

    public String getPhone() {
        return m12751b(this.f19678c.f19780h);
    }

    public String[] getPhones() {
        return m12750a(this.f19678c.f19780h);
    }

    public String getVkConnectId() {
        return m12751b(this.f19678c.f19781i);
    }

    public String[] getVkConnectIds() {
        return m12750a(this.f19678c.f19781i);
    }

    public String getVkId() {
        return m12751b(this.f19678c.f19776d);
    }

    public String[] getVkIds() {
        return m12750a(this.f19678c.f19776d);
    }

    public MyTrackerParams setAge(int i) {
        synchronized (this.f19677b) {
            try {
                if (this.f19678c.f19773a != i) {
                    C2298b3 c2298b3 = new C2298b3(i, this.f19678c.f19774b, this.f19678c.f19775c, this.f19678c.f19776d, this.f19678c.f19777e, this.f19678c.f19778f, this.f19678c.f19779g, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setCustomParam(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            this.f19679d.remove(lowerCase);
        } else {
            this.f19679d.put(lowerCase, str2);
        }
        return this;
    }

    public MyTrackerParams setCustomUserId(String str) {
        return setCustomUserIds(m12749a(str));
    }

    public MyTrackerParams setCustomUserIds(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19779g, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, this.f19678c.f19775c, this.f19678c.f19776d, this.f19678c.f19777e, this.f19678c.f19778f, strArrM12750a, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setEmail(String str) {
        return setEmails(m12749a(str));
    }

    public MyTrackerParams setEmails(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19777e, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, this.f19678c.f19775c, this.f19678c.f19776d, strArrM12750a, this.f19678c.f19778f, this.f19678c.f19779g, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setGender(int i) {
        synchronized (this.f19677b) {
            try {
                if (this.f19678c.f19774b != i) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, i, this.f19678c.f19775c, this.f19678c.f19776d, this.f19678c.f19777e, this.f19678c.f19778f, this.f19678c.f19779g, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setIcqId(String str) {
        return setIcqIds(m12749a(str));
    }

    public MyTrackerParams setIcqIds(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19778f, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, this.f19678c.f19775c, this.f19678c.f19776d, this.f19678c.f19777e, strArrM12750a, this.f19678c.f19779g, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setLang(String str) {
        this.f19680e = str;
        return this;
    }

    public MyTrackerParams setMrgsAppId(String str) {
        this.f19681f = str;
        return this;
    }

    public MyTrackerParams setMrgsId(String str) {
        this.f19683h = str;
        return this;
    }

    public MyTrackerParams setMrgsUserId(String str) {
        this.f19682g = str;
        return this;
    }

    public MyTrackerParams setOkId(String str) {
        return setOkIds(m12749a(str));
    }

    public MyTrackerParams setOkIds(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19775c, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, strArrM12750a, this.f19678c.f19776d, this.f19678c.f19777e, this.f19678c.f19778f, this.f19678c.f19779g, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setPhone(String str) {
        return setPhones(m12749a(str));
    }

    public MyTrackerParams setPhones(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19780h, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, this.f19678c.f19775c, this.f19678c.f19776d, this.f19678c.f19777e, this.f19678c.f19778f, this.f19678c.f19779g, strArrM12750a, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setVkConnectId(String str) {
        return setVkConnectIds(m12749a(str));
    }

    public MyTrackerParams setVkConnectIds(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19781i, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, this.f19678c.f19775c, this.f19678c.f19776d, this.f19678c.f19777e, this.f19678c.f19778f, this.f19678c.f19779g, this.f19678c.f19780h, strArrM12750a);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setVkId(String str) {
        return setVkIds(m12749a(str));
    }

    public MyTrackerParams setVkIds(String[] strArr) {
        synchronized (this.f19677b) {
            try {
                String[] strArrM12750a = m12750a(strArr);
                if (AbstractC2336l.m13285a(this.f19678c.f19776d, strArr) != 0) {
                    C2298b3 c2298b3 = new C2298b3(this.f19678c.f19773a, this.f19678c.f19774b, this.f19678c.f19775c, strArrM12750a, this.f19678c.f19777e, this.f19678c.f19778f, this.f19678c.f19779g, this.f19678c.f19780h, this.f19678c.f19781i);
                    m12748a(c2298b3);
                    this.f19678c = c2298b3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    /* renamed from: a */
    private static String[] m12750a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    /* renamed from: a */
    private static String[] m12749a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: a */
    private void m12748a(C2298b3 c2298b3) {
        synchronized (this.f19676a) {
            try {
                Iterator it = this.f19676a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2368t) it.next()).mo7467a(c2298b3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public C2285a m12752a() {
        return new C2285a(this.f19681f, this.f19682g, this.f19683h, this.f19680e, this.f19679d);
    }
}
