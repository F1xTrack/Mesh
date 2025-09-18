package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Cq0 */
/* loaded from: classes.dex */
public class MenuC7450Cq0 implements Menu {

    /* renamed from: y */
    public static final int[] f1701y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f1702a;

    /* renamed from: b */
    public final Resources f1703b;

    /* renamed from: c */
    public boolean f1704c;

    /* renamed from: d */
    public final boolean f1705d;

    /* renamed from: e */
    public InterfaceC7346Aq0 f1706e;

    /* renamed from: f */
    public final ArrayList f1707f;

    /* renamed from: g */
    public final ArrayList f1708g;

    /* renamed from: h */
    public boolean f1709h;

    /* renamed from: i */
    public final ArrayList f1710i;

    /* renamed from: j */
    public final ArrayList f1711j;

    /* renamed from: k */
    public boolean f1712k;

    /* renamed from: m */
    public CharSequence f1714m;

    /* renamed from: n */
    public Drawable f1715n;

    /* renamed from: o */
    public View f1716o;

    /* renamed from: v */
    public C7866Kq0 f1723v;

    /* renamed from: x */
    public boolean f1725x;

    /* renamed from: l */
    public int f1713l = 0;

    /* renamed from: p */
    public boolean f1717p = false;

    /* renamed from: q */
    public boolean f1718q = false;

    /* renamed from: r */
    public boolean f1719r = false;

    /* renamed from: s */
    public boolean f1720s = false;

    /* renamed from: t */
    public final ArrayList f1721t = new ArrayList();

    /* renamed from: u */
    public final CopyOnWriteArrayList f1722u = new CopyOnWriteArrayList();

    /* renamed from: w */
    public boolean f1724w = false;

    public MenuC7450Cq0(Context context) {
        boolean zM24978b;
        boolean z = false;
        this.f1702a = context;
        Resources resources = context.getResources();
        this.f1703b = resources;
        this.f1707f = new ArrayList();
        this.f1708g = new ArrayList();
        this.f1709h = true;
        this.f1710i = new ArrayList();
        this.f1711j = new ArrayList();
        this.f1712k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC11456vk1.f44514a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM24978b = AbstractC11200tk1.m24978b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                zM24978b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM24978b) {
                z = true;
            }
        }
        this.f1705d = z;
    }

    /* renamed from: a */
    public final C7866Kq0 m1402a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f1701y[i5] << 16) | (65535 & i3);
        C7866Kq0 c7866Kq0 = new C7866Kq0(this, i, i2, i3, i6, charSequence, this.f1713l);
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C7866Kq0) arrayList.get(size)).f6335d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c7866Kq0);
        m1417p(true);
        return c7866Kq0;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1402a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1702a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C7866Kq0 c7866Kq0M1402a = m1402a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c7866Kq0M1402a.setIcon(resolveInfo.loadIcon(packageManager));
            c7866Kq0M1402a.f6338g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c7866Kq0M1402a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m1403b(InterfaceC8542Xq0 interfaceC8542Xq0, Context context) {
        this.f1722u.add(new WeakReference(interfaceC8542Xq0));
        interfaceC8542Xq0.mo308k(context, this);
        this.f1712k = true;
    }

    /* renamed from: c */
    public final void m1404c(boolean z) {
        if (this.f1720s) {
            return;
        }
        this.f1720s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1722u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC8542Xq0 interfaceC8542Xq0 = (InterfaceC8542Xq0) weakReference.get();
            if (interfaceC8542Xq0 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC8542Xq0.mo304f(this, z);
            }
        }
        this.f1720s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C7866Kq0 c7866Kq0 = this.f1723v;
        if (c7866Kq0 != null) {
            mo1405d(c7866Kq0);
        }
        this.f1707f.clear();
        m1417p(true);
    }

    public final void clearHeader() {
        this.f1715n = null;
        this.f1714m = null;
        this.f1716o = null;
        m1417p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m1404c(true);
    }

    /* renamed from: d */
    public boolean mo1405d(C7866Kq0 c7866Kq0) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1722u;
        boolean zMo303e = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f1723v == c7866Kq0) {
            m1424w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC8542Xq0 interfaceC8542Xq0 = (InterfaceC8542Xq0) weakReference.get();
                if (interfaceC8542Xq0 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo303e = interfaceC8542Xq0.mo303e(c7866Kq0);
                    if (zMo303e) {
                        break;
                    }
                }
            }
            m1423v();
            if (zMo303e) {
                this.f1723v = null;
            }
        }
        return zMo303e;
    }

    /* renamed from: e */
    public boolean mo1406e(MenuC7450Cq0 menuC7450Cq0, MenuItem menuItem) {
        InterfaceC7346Aq0 interfaceC7346Aq0 = this.f1706e;
        return interfaceC7346Aq0 != null && interfaceC7346Aq0.mo346g(menuC7450Cq0, menuItem);
    }

    /* renamed from: f */
    public boolean mo1407f(C7866Kq0 c7866Kq0) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1722u;
        boolean zMo306h = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m1424w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC8542Xq0 interfaceC8542Xq0 = (InterfaceC8542Xq0) weakReference.get();
            if (interfaceC8542Xq0 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zMo306h = interfaceC8542Xq0.mo306h(c7866Kq0);
                if (zMo306h) {
                    break;
                }
            }
        }
        m1423v();
        if (zMo306h) {
            this.f1723v = c7866Kq0;
        }
        return zMo306h;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList.get(i2);
            if (c7866Kq0.f6332a == i) {
                return c7866Kq0;
            }
            if (c7866Kq0.hasSubMenu() && (menuItemFindItem = c7866Kq0.f6346o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C7866Kq0 m1408g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1721t;
        arrayList.clear();
        m1409h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C7866Kq0) arrayList.get(0);
        }
        boolean zMo1415n = mo1415n();
        for (int i2 = 0; i2 < size; i2++) {
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList.get(i2);
            char c = zMo1415n ? c7866Kq0.f6341j : c7866Kq0.f6339h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo1415n && c == '\b' && i == 67))) {
                return c7866Kq0;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f1707f.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0069  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1409h(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.mo1415n()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f1707f
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            Kq0 r12 = (p000.C7866Kq0) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            I51 r13 = r12.f6346o
            r13.m1409h(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.f6341j
            goto L42
        L40:
            char r13 = r12.f6339h
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.f6342k
            goto L49
        L47:
            int r14 = r12.f6340i
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.MenuC7450Cq0.m1409h(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f1725x) {
            return true;
        }
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C7866Kq0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m1410i() {
        ArrayList arrayListM1413l = m1413l();
        if (this.f1712k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1722u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zMo302d = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC8542Xq0 interfaceC8542Xq0 = (InterfaceC8542Xq0) weakReference.get();
                if (interfaceC8542Xq0 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo302d |= interfaceC8542Xq0.mo302d();
                }
            }
            ArrayList arrayList = this.f1710i;
            ArrayList arrayList2 = this.f1711j;
            if (zMo302d) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM1413l.size();
                for (int i = 0; i < size; i++) {
                    C7866Kq0 c7866Kq0 = (C7866Kq0) arrayListM1413l.get(i);
                    if (c7866Kq0.m4770f()) {
                        arrayList.add(c7866Kq0);
                    } else {
                        arrayList2.add(c7866Kq0);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m1413l());
            }
            this.f1712k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m1408g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo1411j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: l */
    public final ArrayList m1413l() {
        boolean z = this.f1709h;
        ArrayList arrayList = this.f1708g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f1707f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList2.get(i);
            if (c7866Kq0.isVisible()) {
                arrayList.add(c7866Kq0);
            }
        }
        this.f1709h = false;
        this.f1712k = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo1414m() {
        return this.f1724w;
    }

    /* renamed from: n */
    public boolean mo1415n() {
        return this.f1704c;
    }

    /* renamed from: o */
    public boolean mo1416o() {
        return this.f1705d;
    }

    /* renamed from: p */
    public final void m1417p(boolean z) {
        if (this.f1717p) {
            this.f1718q = true;
            if (z) {
                this.f1719r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f1709h = true;
            this.f1712k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1722u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m1424w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC8542Xq0 interfaceC8542Xq0 = (InterfaceC8542Xq0) weakReference.get();
            if (interfaceC8542Xq0 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC8542Xq0.mo307i();
            }
        }
        m1423v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m1418q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C7866Kq0 c7866Kq0M1408g = m1408g(i, keyEvent);
        boolean zM1418q = c7866Kq0M1408g != null ? m1418q(c7866Kq0M1408g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m1404c(true);
        }
        return zM1418q;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0018  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1418q(android.view.MenuItem r7, p000.InterfaceC8542Xq0 r8, int r9) {
        /*
            r6 = this;
            Kq0 r7 = (p000.C7866Kq0) r7
            r0 = 0
            if (r7 == 0) goto Lcf
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcf
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f6347p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L3b
        L1a:
            Cq0 r1 = r7.f6345n
            boolean r3 = r1.mo1406e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f6338g
            if (r3 == 0) goto L2d
            android.content.Context r1 = r1.f1702a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            Lq0 r1 = r7.f6329A
            if (r1 == 0) goto L3a
            android.view.ActionProvider r1 = r1.f6895b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3a
            goto L18
        L3a:
            r1 = r0
        L3b:
            Lq0 r3 = r7.f6329A
            if (r3 == 0) goto L49
            android.view.ActionProvider r4 = r3.f6895b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L49
            r4 = r2
            goto L4a
        L49:
            r4 = r0
        L4a:
            boolean r5 = r7.m4769e()
            if (r5 == 0) goto L5c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lce
            r6.m1404c(r2)
            goto Lce
        L5c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L65
            goto L6d
        L65:
            r7 = r9 & 1
            if (r7 != 0) goto Lce
            r6.m1404c(r2)
            goto Lce
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.m1404c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            I51 r9 = new I51
            android.content.Context r5 = r6.f1702a
            r9.<init>(r5, r6, r7)
            r7.f6346o = r9
            java.lang.CharSequence r5 = r7.f6336e
            r9.setHeaderTitle(r5)
        L88:
            I51 r7 = r7.f6346o
            if (r4 == 0) goto L96
            Oq0 r9 = r3.f6896c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f6895b
            r9.onPrepareSubMenu(r7)
        L96:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f1722u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9f
            goto Lc8
        L9f:
            if (r8 == 0) goto La5
            boolean r0 = r8.mo301c(r7)
        La5:
            java.util.Iterator r8 = r9.iterator()
        La9:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            Xq0 r4 = (p000.InterfaceC8542Xq0) r4
            if (r4 != 0) goto Lc1
            r9.remove(r3)
            goto La9
        Lc1:
            if (r0 != 0) goto La9
            boolean r0 = r4.mo301c(r7)
            goto La9
        Lc8:
            r1 = r1 | r0
            if (r1 != 0) goto Lce
            r6.m1404c(r2)
        Lce:
            return r1
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.MenuC7450Cq0.m1418q(android.view.MenuItem, Xq0, int):boolean");
    }

    /* renamed from: r */
    public final void m1419r(InterfaceC8542Xq0 interfaceC8542Xq0) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1722u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC8542Xq0 interfaceC8542Xq02 = (InterfaceC8542Xq0) weakReference.get();
            if (interfaceC8542Xq02 == null || interfaceC8542Xq02 == interfaceC8542Xq0) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C7866Kq0) arrayList.get(i3)).f6333b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C7866Kq0) arrayList.get(i3)).f6333b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f1707f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            m1417p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C7866Kq0) arrayList.get(i2)).f6332a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f1707f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            m1417p(true);
        }
    }

    /* renamed from: s */
    public final void m1420s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1411j());
        int size = this.f1707f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((I51) item.getSubMenu()).m1420s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList.get(i2);
            if (c7866Kq0.f6333b == i) {
                c7866Kq0.f6355x = (c7866Kq0.f6355x & (-5)) | (z2 ? 4 : 0);
                c7866Kq0.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1724w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList.get(i2);
            if (c7866Kq0.f6333b == i) {
                c7866Kq0.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f1707f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayList.get(i2);
            if (c7866Kq0.f6333b == i) {
                int i3 = c7866Kq0.f6355x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c7866Kq0.f6355x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m1417p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1704c = z;
        m1417p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1707f.size();
    }

    /* renamed from: t */
    public final void m1421t(Bundle bundle) {
        int size = this.f1707f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((I51) item.getSubMenu()).m1421t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1411j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m1422u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f1716o = view;
            this.f1714m = null;
            this.f1715n = null;
        } else {
            if (i > 0) {
                this.f1714m = this.f1703b.getText(i);
            } else if (charSequence != null) {
                this.f1714m = charSequence;
            }
            if (i2 > 0) {
                this.f1715n = AbstractC0628Jy.m4480b(this.f1702a, i2);
            } else if (drawable != null) {
                this.f1715n = drawable;
            }
            this.f1716o = null;
        }
        m1417p(false);
    }

    /* renamed from: v */
    public final void m1423v() {
        this.f1717p = false;
        if (this.f1718q) {
            this.f1718q = false;
            m1417p(this.f1719r);
        }
    }

    /* renamed from: w */
    public final void m1424w() {
        if (this.f1717p) {
            return;
        }
        this.f1717p = true;
        this.f1718q = false;
        this.f1719r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1402a(0, 0, 0, this.f1703b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1703b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1402a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C7866Kq0 c7866Kq0M1402a = m1402a(i, i2, i3, charSequence);
        I51 i51 = new I51(this.f1702a, this, c7866Kq0M1402a);
        c7866Kq0M1402a.f6346o = i51;
        i51.setHeaderTitle(c7866Kq0M1402a.f6336e);
        return i51;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1402a(i, i2, i3, this.f1703b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1703b.getString(i4));
    }

    /* renamed from: k */
    public MenuC7450Cq0 mo1412k() {
        return this;
    }
}
