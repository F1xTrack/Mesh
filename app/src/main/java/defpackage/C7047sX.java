package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.util.ArrayList;

/* renamed from: sX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7047sX {
    public final ArrayList a = new ArrayList(2);

    public final void a(String str, Throwable th, K2 k2) {
        O90.f(str, NotificationConstants.ID);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((C7047sX) arrayList.get(i)).a(str, th, k2);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final void b(String str, L60 l60, K2 k2) {
        O90.f(str, NotificationConstants.ID);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((C7047sX) arrayList.get(i)).b(str, l60, k2);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final void c(String str) {
        O90.f(str, NotificationConstants.ID);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((C7047sX) arrayList.get(i)).c(str);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final void d(String str, L60 l60) {
        O90.f(str, NotificationConstants.ID);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((C7047sX) arrayList.get(i)).d(str, l60);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final void e(String str, K2 k2) {
        O90.f(str, NotificationConstants.ID);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((C7047sX) arrayList.get(i)).e(str, k2);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final void f(String str, Object obj, K2 k2) {
        O90.f(str, NotificationConstants.ID);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((C7047sX) arrayList.get(i)).f(str, obj, k2);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }
}
