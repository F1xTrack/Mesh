package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* renamed from: mj0 */
/* loaded from: classes2.dex */
public final class C10301mj0 extends AbstractMap implements Serializable {

    /* renamed from: j */
    public static final C8774aq0 f37846j = new C8774aq0(17);

    /* renamed from: k */
    public static final C8774aq0 f37847k = new C8774aq0(18);

    /* renamed from: a */
    public final /* synthetic */ int f37848a;

    /* renamed from: b */
    public final Comparator f37849b;

    /* renamed from: c */
    public final boolean f37850c;

    /* renamed from: d */
    public int f37851d;

    /* renamed from: e */
    public int f37852e;

    /* renamed from: f */
    public Map.Entry f37853f;

    /* renamed from: g */
    public final Map.Entry f37854g;

    /* renamed from: h */
    public AbstractSet f37855h;

    /* renamed from: i */
    public AbstractSet f37856i;

    public C10301mj0(boolean z, int i) {
        this.f37848a = i;
        switch (i) {
            case 1:
                C8774aq0 c8774aq0 = f37847k;
                this.f37851d = 0;
                this.f37852e = 0;
                this.f37849b = c8774aq0;
                this.f37850c = z;
                this.f37854g = new C10173lj0(z, 1);
                break;
            default:
                C8774aq0 c8774aq02 = f37846j;
                this.f37851d = 0;
                this.f37852e = 0;
                this.f37849b = c8774aq02;
                this.f37850c = z;
                this.f37854g = new C10173lj0(z, 0);
                break;
        }
    }

    /* renamed from: a */
    public C10173lj0 m22924a(Object obj, boolean z) {
        int iCompareTo;
        C10173lj0 c10173lj0;
        C10173lj0 c10173lj02 = (C10173lj0) this.f37853f;
        C8774aq0 c8774aq0 = f37846j;
        Comparator comparator = this.f37849b;
        if (c10173lj02 != null) {
            Comparable comparable = comparator == c8774aq0 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c10173lj02.f37264b;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c10173lj02;
                }
                C10173lj0 c10173lj03 = (C10173lj0) (iCompareTo < 0 ? c10173lj02.f37269g : c10173lj02.f37270h);
                if (c10173lj03 == null) {
                    break;
                }
                c10173lj02 = c10173lj03;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C10173lj0 c10173lj04 = (C10173lj0) this.f37854g;
        if (c10173lj02 != null) {
            c10173lj0 = new C10173lj0(this.f37850c, c10173lj02, obj, c10173lj04, (C10173lj0) c10173lj04.f37272j);
            if (iCompareTo < 0) {
                c10173lj02.f37269g = c10173lj0;
            } else {
                c10173lj02.f37270h = c10173lj0;
            }
            m22926c(c10173lj02, true);
        } else {
            if (comparator == c8774aq0 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c10173lj0 = new C10173lj0(this.f37850c, c10173lj02, obj, c10173lj04, (C10173lj0) c10173lj04.f37272j);
            this.f37853f = c10173lj0;
        }
        this.f37851d++;
        this.f37852e++;
        return c10173lj0;
    }

    /* renamed from: b */
    public C10173lj0 m22925b(Object obj, boolean z) {
        int iCompareTo;
        C10173lj0 c10173lj0;
        C10173lj0 c10173lj02 = (C10173lj0) this.f37853f;
        C8774aq0 c8774aq0 = f37847k;
        Comparator comparator = this.f37849b;
        if (c10173lj02 != null) {
            Comparable comparable = comparator == c8774aq0 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c10173lj02.f37264b;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c10173lj02;
                }
                C10173lj0 c10173lj03 = (C10173lj0) (iCompareTo < 0 ? c10173lj02.f37269g : c10173lj02.f37270h);
                if (c10173lj03 == null) {
                    break;
                }
                c10173lj02 = c10173lj03;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C10173lj0 c10173lj04 = (C10173lj0) this.f37854g;
        if (c10173lj02 != null) {
            c10173lj0 = new C10173lj0(this.f37850c, c10173lj02, obj, c10173lj04, (C10173lj0) c10173lj04.f37272j, (byte) 0);
            if (iCompareTo < 0) {
                c10173lj02.f37269g = c10173lj0;
            } else {
                c10173lj02.f37270h = c10173lj0;
            }
            m22927d(c10173lj02, true);
        } else {
            if (comparator == c8774aq0 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c10173lj0 = new C10173lj0(this.f37850c, c10173lj02, obj, c10173lj04, (C10173lj0) c10173lj04.f37272j, (byte) 0);
            this.f37853f = c10173lj0;
        }
        this.f37851d++;
        this.f37852e++;
        return c10173lj0;
    }

    /* renamed from: c */
    public void m22926c(C10173lj0 c10173lj0, boolean z) {
        while (c10173lj0 != null) {
            C10173lj0 c10173lj02 = (C10173lj0) c10173lj0.f37269g;
            C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37270h;
            int i = c10173lj02 != null ? c10173lj02.f37267e : 0;
            int i2 = c10173lj03 != null ? c10173lj03.f37267e : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C10173lj0 c10173lj04 = (C10173lj0) c10173lj03.f37269g;
                C10173lj0 c10173lj05 = (C10173lj0) c10173lj03.f37270h;
                int i4 = (c10173lj04 != null ? c10173lj04.f37267e : 0) - (c10173lj05 != null ? c10173lj05.f37267e : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m22932j(c10173lj0);
                } else {
                    m22934l(c10173lj03);
                    m22932j(c10173lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C10173lj0 c10173lj06 = (C10173lj0) c10173lj02.f37269g;
                C10173lj0 c10173lj07 = (C10173lj0) c10173lj02.f37270h;
                int i5 = (c10173lj06 != null ? c10173lj06.f37267e : 0) - (c10173lj07 != null ? c10173lj07.f37267e : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m22934l(c10173lj0);
                } else {
                    m22932j(c10173lj02);
                    m22934l(c10173lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c10173lj0.f37267e = i + 1;
                if (z) {
                    return;
                }
            } else {
                c10173lj0.f37267e = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c10173lj0 = (C10173lj0) c10173lj0.f37268f;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f37848a) {
            case 0:
                this.f37853f = null;
                this.f37851d = 0;
                this.f37852e++;
                C10173lj0 c10173lj0 = (C10173lj0) this.f37854g;
                c10173lj0.f37272j = c10173lj0;
                c10173lj0.f37271i = c10173lj0;
                break;
            default:
                this.f37853f = null;
                this.f37851d = 0;
                this.f37852e++;
                C10173lj0 c10173lj02 = (C10173lj0) this.f37854g;
                c10173lj02.f37272j = c10173lj02;
                c10173lj02.f37271i = c10173lj02;
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f37848a) {
            case 0:
                C10173lj0 c10173lj0M22924a = null;
                if (obj != null) {
                    try {
                        c10173lj0M22924a = m22924a(obj, false);
                    } catch (ClassCastException unused) {
                    }
                }
                if (c10173lj0M22924a != null) {
                }
                break;
            default:
                C10173lj0 c10173lj0M22925b = null;
                if (obj != null) {
                    try {
                        c10173lj0M22925b = m22925b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c10173lj0M22925b != null) {
                }
                break;
        }
        return false;
    }

    /* renamed from: d */
    public void m22927d(C10173lj0 c10173lj0, boolean z) {
        while (c10173lj0 != null) {
            C10173lj0 c10173lj02 = (C10173lj0) c10173lj0.f37269g;
            C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37270h;
            int i = c10173lj02 != null ? c10173lj02.f37267e : 0;
            int i2 = c10173lj03 != null ? c10173lj03.f37267e : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C10173lj0 c10173lj04 = (C10173lj0) c10173lj03.f37269g;
                C10173lj0 c10173lj05 = (C10173lj0) c10173lj03.f37270h;
                int i4 = (c10173lj04 != null ? c10173lj04.f37267e : 0) - (c10173lj05 != null ? c10173lj05.f37267e : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m22933k(c10173lj0);
                } else {
                    m22935m(c10173lj03);
                    m22933k(c10173lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C10173lj0 c10173lj06 = (C10173lj0) c10173lj02.f37269g;
                C10173lj0 c10173lj07 = (C10173lj0) c10173lj02.f37270h;
                int i5 = (c10173lj06 != null ? c10173lj06.f37267e : 0) - (c10173lj07 != null ? c10173lj07.f37267e : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m22935m(c10173lj0);
                } else {
                    m22933k(c10173lj02);
                    m22935m(c10173lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c10173lj0.f37267e = i + 1;
                if (z) {
                    return;
                }
            } else {
                c10173lj0.f37267e = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c10173lj0 = (C10173lj0) c10173lj0.f37268f;
        }
    }

    /* renamed from: e */
    public void m22928e(C10173lj0 c10173lj0, boolean z) {
        C10173lj0 c10173lj02;
        C10173lj0 c10173lj03;
        int i;
        if (z) {
            C10173lj0 c10173lj04 = (C10173lj0) c10173lj0.f37272j;
            c10173lj04.f37271i = (C10173lj0) c10173lj0.f37271i;
            ((C10173lj0) c10173lj0.f37271i).f37272j = c10173lj04;
        }
        C10173lj0 c10173lj05 = (C10173lj0) c10173lj0.f37269g;
        C10173lj0 c10173lj06 = (C10173lj0) c10173lj0.f37270h;
        C10173lj0 c10173lj07 = (C10173lj0) c10173lj0.f37268f;
        int i2 = 0;
        if (c10173lj05 == null || c10173lj06 == null) {
            if (c10173lj05 != null) {
                m22930g(c10173lj0, c10173lj05);
                c10173lj0.f37269g = null;
            } else if (c10173lj06 != null) {
                m22930g(c10173lj0, c10173lj06);
                c10173lj0.f37270h = null;
            } else {
                m22930g(c10173lj0, null);
            }
            m22926c(c10173lj07, false);
            this.f37851d--;
            this.f37852e++;
            return;
        }
        if (c10173lj05.f37267e > c10173lj06.f37267e) {
            Map.Entry entry = c10173lj05.f37270h;
            while (true) {
                C10173lj0 c10173lj08 = (C10173lj0) entry;
                c10173lj03 = c10173lj05;
                c10173lj05 = c10173lj08;
                if (c10173lj05 == null) {
                    break;
                } else {
                    entry = c10173lj05.f37270h;
                }
            }
        } else {
            Map.Entry entry2 = c10173lj06.f37269g;
            while (true) {
                c10173lj02 = c10173lj06;
                c10173lj06 = (C10173lj0) entry2;
                if (c10173lj06 == null) {
                    break;
                } else {
                    entry2 = c10173lj06.f37269g;
                }
            }
            c10173lj03 = c10173lj02;
        }
        m22928e(c10173lj03, false);
        C10173lj0 c10173lj09 = (C10173lj0) c10173lj0.f37269g;
        if (c10173lj09 != null) {
            i = c10173lj09.f37267e;
            c10173lj03.f37269g = c10173lj09;
            c10173lj09.f37268f = c10173lj03;
            c10173lj0.f37269g = null;
        } else {
            i = 0;
        }
        C10173lj0 c10173lj010 = (C10173lj0) c10173lj0.f37270h;
        if (c10173lj010 != null) {
            i2 = c10173lj010.f37267e;
            c10173lj03.f37270h = c10173lj010;
            c10173lj010.f37268f = c10173lj03;
            c10173lj0.f37270h = null;
        }
        c10173lj03.f37267e = Math.max(i, i2) + 1;
        m22930g(c10173lj0, c10173lj03);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f37848a) {
            case 0:
                C9789ij0 c9789ij0 = (C9789ij0) this.f37855h;
                if (c9789ij0 != null) {
                    return c9789ij0;
                }
                C9789ij0 c9789ij02 = new C9789ij0(this, 0);
                this.f37855h = c9789ij02;
                return c9789ij02;
            default:
                C9917jj0 c9917jj0 = (C9917jj0) this.f37855h;
                if (c9917jj0 != null) {
                    return c9917jj0;
                }
                C9917jj0 c9917jj02 = new C9917jj0(this, 0);
                this.f37855h = c9917jj02;
                return c9917jj02;
        }
    }

    /* renamed from: f */
    public void m22929f(C10173lj0 c10173lj0, boolean z) {
        C10173lj0 c10173lj02;
        C10173lj0 c10173lj03;
        int i;
        if (z) {
            C10173lj0 c10173lj04 = (C10173lj0) c10173lj0.f37272j;
            c10173lj04.f37271i = (C10173lj0) c10173lj0.f37271i;
            ((C10173lj0) c10173lj0.f37271i).f37272j = c10173lj04;
        }
        C10173lj0 c10173lj05 = (C10173lj0) c10173lj0.f37269g;
        C10173lj0 c10173lj06 = (C10173lj0) c10173lj0.f37270h;
        C10173lj0 c10173lj07 = (C10173lj0) c10173lj0.f37268f;
        int i2 = 0;
        if (c10173lj05 == null || c10173lj06 == null) {
            if (c10173lj05 != null) {
                m22931i(c10173lj0, c10173lj05);
                c10173lj0.f37269g = null;
            } else if (c10173lj06 != null) {
                m22931i(c10173lj0, c10173lj06);
                c10173lj0.f37270h = null;
            } else {
                m22931i(c10173lj0, null);
            }
            m22927d(c10173lj07, false);
            this.f37851d--;
            this.f37852e++;
            return;
        }
        if (c10173lj05.f37267e > c10173lj06.f37267e) {
            Map.Entry entry = c10173lj05.f37270h;
            while (true) {
                C10173lj0 c10173lj08 = (C10173lj0) entry;
                c10173lj03 = c10173lj05;
                c10173lj05 = c10173lj08;
                if (c10173lj05 == null) {
                    break;
                } else {
                    entry = c10173lj05.f37270h;
                }
            }
        } else {
            Map.Entry entry2 = c10173lj06.f37269g;
            while (true) {
                c10173lj02 = c10173lj06;
                c10173lj06 = (C10173lj0) entry2;
                if (c10173lj06 == null) {
                    break;
                } else {
                    entry2 = c10173lj06.f37269g;
                }
            }
            c10173lj03 = c10173lj02;
        }
        m22929f(c10173lj03, false);
        C10173lj0 c10173lj09 = (C10173lj0) c10173lj0.f37269g;
        if (c10173lj09 != null) {
            i = c10173lj09.f37267e;
            c10173lj03.f37269g = c10173lj09;
            c10173lj09.f37268f = c10173lj03;
            c10173lj0.f37269g = null;
        } else {
            i = 0;
        }
        C10173lj0 c10173lj010 = (C10173lj0) c10173lj0.f37270h;
        if (c10173lj010 != null) {
            i2 = c10173lj010.f37267e;
            c10173lj03.f37270h = c10173lj010;
            c10173lj010.f37268f = c10173lj03;
            c10173lj0.f37270h = null;
        }
        c10173lj03.f37267e = Math.max(i, i2) + 1;
        m22931i(c10173lj0, c10173lj03);
    }

    /* renamed from: g */
    public void m22930g(C10173lj0 c10173lj0, C10173lj0 c10173lj02) {
        C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37268f;
        c10173lj0.f37268f = null;
        if (c10173lj02 != null) {
            c10173lj02.f37268f = c10173lj03;
        }
        if (c10173lj03 == null) {
            this.f37853f = c10173lj02;
        } else if (((C10173lj0) c10173lj03.f37269g) == c10173lj0) {
            c10173lj03.f37269g = c10173lj02;
        } else {
            c10173lj03.f37270h = c10173lj02;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C10173lj0 c10173lj0M22924a;
        C10173lj0 c10173lj0M22925b;
        switch (this.f37848a) {
            case 0:
                if (obj != null) {
                    try {
                        c10173lj0M22924a = m22924a(obj, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c10173lj0M22924a = null;
                }
                if (c10173lj0M22924a != null) {
                    return c10173lj0M22924a.f37266d;
                }
                return null;
            default:
                if (obj != null) {
                    try {
                        c10173lj0M22925b = m22925b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                } else {
                    c10173lj0M22925b = null;
                }
                if (c10173lj0M22925b != null) {
                    return c10173lj0M22925b.f37266d;
                }
                return null;
        }
    }

    /* renamed from: i */
    public void m22931i(C10173lj0 c10173lj0, C10173lj0 c10173lj02) {
        C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37268f;
        c10173lj0.f37268f = null;
        if (c10173lj02 != null) {
            c10173lj02.f37268f = c10173lj03;
        }
        if (c10173lj03 == null) {
            this.f37853f = c10173lj02;
        } else if (((C10173lj0) c10173lj03.f37269g) == c10173lj0) {
            c10173lj03.f37269g = c10173lj02;
        } else {
            c10173lj03.f37270h = c10173lj02;
        }
    }

    /* renamed from: j */
    public void m22932j(C10173lj0 c10173lj0) {
        C10173lj0 c10173lj02 = (C10173lj0) c10173lj0.f37269g;
        C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37270h;
        C10173lj0 c10173lj04 = (C10173lj0) c10173lj03.f37269g;
        C10173lj0 c10173lj05 = (C10173lj0) c10173lj03.f37270h;
        c10173lj0.f37270h = c10173lj04;
        if (c10173lj04 != null) {
            c10173lj04.f37268f = c10173lj0;
        }
        m22930g(c10173lj0, c10173lj03);
        c10173lj03.f37269g = c10173lj0;
        c10173lj0.f37268f = c10173lj03;
        int iMax = Math.max(c10173lj02 != null ? c10173lj02.f37267e : 0, c10173lj04 != null ? c10173lj04.f37267e : 0) + 1;
        c10173lj0.f37267e = iMax;
        c10173lj03.f37267e = Math.max(iMax, c10173lj05 != null ? c10173lj05.f37267e : 0) + 1;
    }

    /* renamed from: k */
    public void m22933k(C10173lj0 c10173lj0) {
        C10173lj0 c10173lj02 = (C10173lj0) c10173lj0.f37269g;
        C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37270h;
        C10173lj0 c10173lj04 = (C10173lj0) c10173lj03.f37269g;
        C10173lj0 c10173lj05 = (C10173lj0) c10173lj03.f37270h;
        c10173lj0.f37270h = c10173lj04;
        if (c10173lj04 != null) {
            c10173lj04.f37268f = c10173lj0;
        }
        m22931i(c10173lj0, c10173lj03);
        c10173lj03.f37269g = c10173lj0;
        c10173lj0.f37268f = c10173lj03;
        int iMax = Math.max(c10173lj02 != null ? c10173lj02.f37267e : 0, c10173lj04 != null ? c10173lj04.f37267e : 0) + 1;
        c10173lj0.f37267e = iMax;
        c10173lj03.f37267e = Math.max(iMax, c10173lj05 != null ? c10173lj05.f37267e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.f37848a) {
            case 0:
                C9789ij0 c9789ij0 = (C9789ij0) this.f37856i;
                if (c9789ij0 != null) {
                    return c9789ij0;
                }
                C9789ij0 c9789ij02 = new C9789ij0(this, 1);
                this.f37856i = c9789ij02;
                return c9789ij02;
            default:
                C9917jj0 c9917jj0 = (C9917jj0) this.f37856i;
                if (c9917jj0 != null) {
                    return c9917jj0;
                }
                C9917jj0 c9917jj02 = new C9917jj0(this, 1);
                this.f37856i = c9917jj02;
                return c9917jj02;
        }
    }

    /* renamed from: l */
    public void m22934l(C10173lj0 c10173lj0) {
        C10173lj0 c10173lj02 = (C10173lj0) c10173lj0.f37269g;
        C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37270h;
        C10173lj0 c10173lj04 = (C10173lj0) c10173lj02.f37269g;
        C10173lj0 c10173lj05 = (C10173lj0) c10173lj02.f37270h;
        c10173lj0.f37269g = c10173lj05;
        if (c10173lj05 != null) {
            c10173lj05.f37268f = c10173lj0;
        }
        m22930g(c10173lj0, c10173lj02);
        c10173lj02.f37270h = c10173lj0;
        c10173lj0.f37268f = c10173lj02;
        int iMax = Math.max(c10173lj03 != null ? c10173lj03.f37267e : 0, c10173lj05 != null ? c10173lj05.f37267e : 0) + 1;
        c10173lj0.f37267e = iMax;
        c10173lj02.f37267e = Math.max(iMax, c10173lj04 != null ? c10173lj04.f37267e : 0) + 1;
    }

    /* renamed from: m */
    public void m22935m(C10173lj0 c10173lj0) {
        C10173lj0 c10173lj02 = (C10173lj0) c10173lj0.f37269g;
        C10173lj0 c10173lj03 = (C10173lj0) c10173lj0.f37270h;
        C10173lj0 c10173lj04 = (C10173lj0) c10173lj02.f37269g;
        C10173lj0 c10173lj05 = (C10173lj0) c10173lj02.f37270h;
        c10173lj0.f37269g = c10173lj05;
        if (c10173lj05 != null) {
            c10173lj05.f37268f = c10173lj0;
        }
        m22931i(c10173lj0, c10173lj02);
        c10173lj02.f37270h = c10173lj0;
        c10173lj0.f37268f = c10173lj02;
        int iMax = Math.max(c10173lj03 != null ? c10173lj03.f37267e : 0, c10173lj05 != null ? c10173lj05.f37267e : 0) + 1;
        c10173lj0.f37267e = iMax;
        c10173lj02.f37267e = Math.max(iMax, c10173lj04 != null ? c10173lj04.f37267e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f37848a) {
            case 0:
                if (obj == null) {
                    throw new NullPointerException("key == null");
                }
                if (obj2 == null && !this.f37850c) {
                    throw new NullPointerException("value == null");
                }
                C10173lj0 c10173lj0M22924a = m22924a(obj, true);
                Object obj3 = c10173lj0M22924a.f37266d;
                c10173lj0M22924a.f37266d = obj2;
                return obj3;
            default:
                if (obj == null) {
                    throw new NullPointerException("key == null");
                }
                if (obj2 == null && !this.f37850c) {
                    throw new NullPointerException("value == null");
                }
                C10173lj0 c10173lj0M22925b = m22925b(obj, true);
                Object obj4 = c10173lj0M22925b.f37266d;
                c10173lj0M22925b.f37266d = obj2;
                return obj4;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C10173lj0 c10173lj0M22924a;
        C10173lj0 c10173lj0M22925b;
        switch (this.f37848a) {
            case 0:
                if (obj != null) {
                    try {
                        c10173lj0M22924a = m22924a(obj, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c10173lj0M22924a = null;
                }
                if (c10173lj0M22924a != null) {
                    m22928e(c10173lj0M22924a, true);
                }
                if (c10173lj0M22924a != null) {
                    return c10173lj0M22924a.f37266d;
                }
                return null;
            default:
                if (obj != null) {
                    try {
                        c10173lj0M22925b = m22925b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                } else {
                    c10173lj0M22925b = null;
                }
                if (c10173lj0M22925b != null) {
                    m22929f(c10173lj0M22925b, true);
                }
                if (c10173lj0M22925b != null) {
                    return c10173lj0M22925b.f37266d;
                }
                return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f37848a) {
        }
        return this.f37851d;
    }
}
