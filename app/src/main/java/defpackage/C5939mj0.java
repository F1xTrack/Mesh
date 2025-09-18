package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* renamed from: mj0 */
/* loaded from: classes2.dex */
public final class C5939mj0 extends AbstractMap implements Serializable {
    public static final C2209aq0 j = new C2209aq0(17);
    public static final C2209aq0 k = new C2209aq0(18);
    public final /* synthetic */ int a;
    public final Comparator b;
    public final boolean c;
    public int d;
    public int e;
    public Map.Entry f;
    public final Map.Entry g;
    public AbstractSet h;
    public AbstractSet i;

    public C5939mj0(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                C2209aq0 c2209aq0 = k;
                this.d = 0;
                this.e = 0;
                this.b = c2209aq0;
                this.c = z;
                this.g = new C5748lj0(z, 1);
                break;
            default:
                C2209aq0 c2209aq02 = j;
                this.d = 0;
                this.e = 0;
                this.b = c2209aq02;
                this.c = z;
                this.g = new C5748lj0(z, 0);
                break;
        }
    }

    public C5748lj0 a(Object obj, boolean z) {
        int iCompareTo;
        C5748lj0 c5748lj0;
        C5748lj0 c5748lj02 = (C5748lj0) this.f;
        C2209aq0 c2209aq0 = j;
        Comparator comparator = this.b;
        if (c5748lj02 != null) {
            Comparable comparable = comparator == c2209aq0 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c5748lj02.b;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c5748lj02;
                }
                C5748lj0 c5748lj03 = (C5748lj0) (iCompareTo < 0 ? c5748lj02.g : c5748lj02.h);
                if (c5748lj03 == null) {
                    break;
                }
                c5748lj02 = c5748lj03;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C5748lj0 c5748lj04 = (C5748lj0) this.g;
        if (c5748lj02 != null) {
            c5748lj0 = new C5748lj0(this.c, c5748lj02, obj, c5748lj04, (C5748lj0) c5748lj04.j);
            if (iCompareTo < 0) {
                c5748lj02.g = c5748lj0;
            } else {
                c5748lj02.h = c5748lj0;
            }
            c(c5748lj02, true);
        } else {
            if (comparator == c2209aq0 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c5748lj0 = new C5748lj0(this.c, c5748lj02, obj, c5748lj04, (C5748lj0) c5748lj04.j);
            this.f = c5748lj0;
        }
        this.d++;
        this.e++;
        return c5748lj0;
    }

    public C5748lj0 b(Object obj, boolean z) {
        int iCompareTo;
        C5748lj0 c5748lj0;
        C5748lj0 c5748lj02 = (C5748lj0) this.f;
        C2209aq0 c2209aq0 = k;
        Comparator comparator = this.b;
        if (c5748lj02 != null) {
            Comparable comparable = comparator == c2209aq0 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c5748lj02.b;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c5748lj02;
                }
                C5748lj0 c5748lj03 = (C5748lj0) (iCompareTo < 0 ? c5748lj02.g : c5748lj02.h);
                if (c5748lj03 == null) {
                    break;
                }
                c5748lj02 = c5748lj03;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        C5748lj0 c5748lj04 = (C5748lj0) this.g;
        if (c5748lj02 != null) {
            c5748lj0 = new C5748lj0(this.c, c5748lj02, obj, c5748lj04, (C5748lj0) c5748lj04.j, (byte) 0);
            if (iCompareTo < 0) {
                c5748lj02.g = c5748lj0;
            } else {
                c5748lj02.h = c5748lj0;
            }
            d(c5748lj02, true);
        } else {
            if (comparator == c2209aq0 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c5748lj0 = new C5748lj0(this.c, c5748lj02, obj, c5748lj04, (C5748lj0) c5748lj04.j, (byte) 0);
            this.f = c5748lj0;
        }
        this.d++;
        this.e++;
        return c5748lj0;
    }

    public void c(C5748lj0 c5748lj0, boolean z) {
        while (c5748lj0 != null) {
            C5748lj0 c5748lj02 = (C5748lj0) c5748lj0.g;
            C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.h;
            int i = c5748lj02 != null ? c5748lj02.e : 0;
            int i2 = c5748lj03 != null ? c5748lj03.e : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C5748lj0 c5748lj04 = (C5748lj0) c5748lj03.g;
                C5748lj0 c5748lj05 = (C5748lj0) c5748lj03.h;
                int i4 = (c5748lj04 != null ? c5748lj04.e : 0) - (c5748lj05 != null ? c5748lj05.e : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    j(c5748lj0);
                } else {
                    l(c5748lj03);
                    j(c5748lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C5748lj0 c5748lj06 = (C5748lj0) c5748lj02.g;
                C5748lj0 c5748lj07 = (C5748lj0) c5748lj02.h;
                int i5 = (c5748lj06 != null ? c5748lj06.e : 0) - (c5748lj07 != null ? c5748lj07.e : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    l(c5748lj0);
                } else {
                    j(c5748lj02);
                    l(c5748lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c5748lj0.e = i + 1;
                if (z) {
                    return;
                }
            } else {
                c5748lj0.e = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c5748lj0 = (C5748lj0) c5748lj0.f;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                this.f = null;
                this.d = 0;
                this.e++;
                C5748lj0 c5748lj0 = (C5748lj0) this.g;
                c5748lj0.j = c5748lj0;
                c5748lj0.i = c5748lj0;
                break;
            default:
                this.f = null;
                this.d = 0;
                this.e++;
                C5748lj0 c5748lj02 = (C5748lj0) this.g;
                c5748lj02.j = c5748lj02;
                c5748lj02.i = c5748lj02;
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                C5748lj0 c5748lj0A = null;
                if (obj != null) {
                    try {
                        c5748lj0A = a(obj, false);
                    } catch (ClassCastException unused) {
                    }
                }
                if (c5748lj0A != null) {
                }
                break;
            default:
                C5748lj0 c5748lj0B = null;
                if (obj != null) {
                    try {
                        c5748lj0B = b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c5748lj0B != null) {
                }
                break;
        }
        return false;
    }

    public void d(C5748lj0 c5748lj0, boolean z) {
        while (c5748lj0 != null) {
            C5748lj0 c5748lj02 = (C5748lj0) c5748lj0.g;
            C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.h;
            int i = c5748lj02 != null ? c5748lj02.e : 0;
            int i2 = c5748lj03 != null ? c5748lj03.e : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C5748lj0 c5748lj04 = (C5748lj0) c5748lj03.g;
                C5748lj0 c5748lj05 = (C5748lj0) c5748lj03.h;
                int i4 = (c5748lj04 != null ? c5748lj04.e : 0) - (c5748lj05 != null ? c5748lj05.e : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    k(c5748lj0);
                } else {
                    m(c5748lj03);
                    k(c5748lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C5748lj0 c5748lj06 = (C5748lj0) c5748lj02.g;
                C5748lj0 c5748lj07 = (C5748lj0) c5748lj02.h;
                int i5 = (c5748lj06 != null ? c5748lj06.e : 0) - (c5748lj07 != null ? c5748lj07.e : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m(c5748lj0);
                } else {
                    k(c5748lj02);
                    m(c5748lj0);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c5748lj0.e = i + 1;
                if (z) {
                    return;
                }
            } else {
                c5748lj0.e = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c5748lj0 = (C5748lj0) c5748lj0.f;
        }
    }

    public void e(C5748lj0 c5748lj0, boolean z) {
        C5748lj0 c5748lj02;
        C5748lj0 c5748lj03;
        int i;
        if (z) {
            C5748lj0 c5748lj04 = (C5748lj0) c5748lj0.j;
            c5748lj04.i = (C5748lj0) c5748lj0.i;
            ((C5748lj0) c5748lj0.i).j = c5748lj04;
        }
        C5748lj0 c5748lj05 = (C5748lj0) c5748lj0.g;
        C5748lj0 c5748lj06 = (C5748lj0) c5748lj0.h;
        C5748lj0 c5748lj07 = (C5748lj0) c5748lj0.f;
        int i2 = 0;
        if (c5748lj05 == null || c5748lj06 == null) {
            if (c5748lj05 != null) {
                g(c5748lj0, c5748lj05);
                c5748lj0.g = null;
            } else if (c5748lj06 != null) {
                g(c5748lj0, c5748lj06);
                c5748lj0.h = null;
            } else {
                g(c5748lj0, null);
            }
            c(c5748lj07, false);
            this.d--;
            this.e++;
            return;
        }
        if (c5748lj05.e > c5748lj06.e) {
            Map.Entry entry = c5748lj05.h;
            while (true) {
                C5748lj0 c5748lj08 = (C5748lj0) entry;
                c5748lj03 = c5748lj05;
                c5748lj05 = c5748lj08;
                if (c5748lj05 == null) {
                    break;
                } else {
                    entry = c5748lj05.h;
                }
            }
        } else {
            Map.Entry entry2 = c5748lj06.g;
            while (true) {
                c5748lj02 = c5748lj06;
                c5748lj06 = (C5748lj0) entry2;
                if (c5748lj06 == null) {
                    break;
                } else {
                    entry2 = c5748lj06.g;
                }
            }
            c5748lj03 = c5748lj02;
        }
        e(c5748lj03, false);
        C5748lj0 c5748lj09 = (C5748lj0) c5748lj0.g;
        if (c5748lj09 != null) {
            i = c5748lj09.e;
            c5748lj03.g = c5748lj09;
            c5748lj09.f = c5748lj03;
            c5748lj0.g = null;
        } else {
            i = 0;
        }
        C5748lj0 c5748lj010 = (C5748lj0) c5748lj0.h;
        if (c5748lj010 != null) {
            i2 = c5748lj010.e;
            c5748lj03.h = c5748lj010;
            c5748lj010.f = c5748lj03;
            c5748lj0.h = null;
        }
        c5748lj03.e = Math.max(i, i2) + 1;
        g(c5748lj0, c5748lj03);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                C4398ij0 c4398ij0 = (C4398ij0) this.h;
                if (c4398ij0 != null) {
                    return c4398ij0;
                }
                C4398ij0 c4398ij02 = new C4398ij0(this, 0);
                this.h = c4398ij02;
                return c4398ij02;
            default:
                C5366jj0 c5366jj0 = (C5366jj0) this.h;
                if (c5366jj0 != null) {
                    return c5366jj0;
                }
                C5366jj0 c5366jj02 = new C5366jj0(this, 0);
                this.h = c5366jj02;
                return c5366jj02;
        }
    }

    public void f(C5748lj0 c5748lj0, boolean z) {
        C5748lj0 c5748lj02;
        C5748lj0 c5748lj03;
        int i;
        if (z) {
            C5748lj0 c5748lj04 = (C5748lj0) c5748lj0.j;
            c5748lj04.i = (C5748lj0) c5748lj0.i;
            ((C5748lj0) c5748lj0.i).j = c5748lj04;
        }
        C5748lj0 c5748lj05 = (C5748lj0) c5748lj0.g;
        C5748lj0 c5748lj06 = (C5748lj0) c5748lj0.h;
        C5748lj0 c5748lj07 = (C5748lj0) c5748lj0.f;
        int i2 = 0;
        if (c5748lj05 == null || c5748lj06 == null) {
            if (c5748lj05 != null) {
                i(c5748lj0, c5748lj05);
                c5748lj0.g = null;
            } else if (c5748lj06 != null) {
                i(c5748lj0, c5748lj06);
                c5748lj0.h = null;
            } else {
                i(c5748lj0, null);
            }
            d(c5748lj07, false);
            this.d--;
            this.e++;
            return;
        }
        if (c5748lj05.e > c5748lj06.e) {
            Map.Entry entry = c5748lj05.h;
            while (true) {
                C5748lj0 c5748lj08 = (C5748lj0) entry;
                c5748lj03 = c5748lj05;
                c5748lj05 = c5748lj08;
                if (c5748lj05 == null) {
                    break;
                } else {
                    entry = c5748lj05.h;
                }
            }
        } else {
            Map.Entry entry2 = c5748lj06.g;
            while (true) {
                c5748lj02 = c5748lj06;
                c5748lj06 = (C5748lj0) entry2;
                if (c5748lj06 == null) {
                    break;
                } else {
                    entry2 = c5748lj06.g;
                }
            }
            c5748lj03 = c5748lj02;
        }
        f(c5748lj03, false);
        C5748lj0 c5748lj09 = (C5748lj0) c5748lj0.g;
        if (c5748lj09 != null) {
            i = c5748lj09.e;
            c5748lj03.g = c5748lj09;
            c5748lj09.f = c5748lj03;
            c5748lj0.g = null;
        } else {
            i = 0;
        }
        C5748lj0 c5748lj010 = (C5748lj0) c5748lj0.h;
        if (c5748lj010 != null) {
            i2 = c5748lj010.e;
            c5748lj03.h = c5748lj010;
            c5748lj010.f = c5748lj03;
            c5748lj0.h = null;
        }
        c5748lj03.e = Math.max(i, i2) + 1;
        i(c5748lj0, c5748lj03);
    }

    public void g(C5748lj0 c5748lj0, C5748lj0 c5748lj02) {
        C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.f;
        c5748lj0.f = null;
        if (c5748lj02 != null) {
            c5748lj02.f = c5748lj03;
        }
        if (c5748lj03 == null) {
            this.f = c5748lj02;
        } else if (((C5748lj0) c5748lj03.g) == c5748lj0) {
            c5748lj03.g = c5748lj02;
        } else {
            c5748lj03.h = c5748lj02;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C5748lj0 c5748lj0A;
        C5748lj0 c5748lj0B;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    try {
                        c5748lj0A = a(obj, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c5748lj0A = null;
                }
                if (c5748lj0A != null) {
                    return c5748lj0A.d;
                }
                return null;
            default:
                if (obj != null) {
                    try {
                        c5748lj0B = b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                } else {
                    c5748lj0B = null;
                }
                if (c5748lj0B != null) {
                    return c5748lj0B.d;
                }
                return null;
        }
    }

    public void i(C5748lj0 c5748lj0, C5748lj0 c5748lj02) {
        C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.f;
        c5748lj0.f = null;
        if (c5748lj02 != null) {
            c5748lj02.f = c5748lj03;
        }
        if (c5748lj03 == null) {
            this.f = c5748lj02;
        } else if (((C5748lj0) c5748lj03.g) == c5748lj0) {
            c5748lj03.g = c5748lj02;
        } else {
            c5748lj03.h = c5748lj02;
        }
    }

    public void j(C5748lj0 c5748lj0) {
        C5748lj0 c5748lj02 = (C5748lj0) c5748lj0.g;
        C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.h;
        C5748lj0 c5748lj04 = (C5748lj0) c5748lj03.g;
        C5748lj0 c5748lj05 = (C5748lj0) c5748lj03.h;
        c5748lj0.h = c5748lj04;
        if (c5748lj04 != null) {
            c5748lj04.f = c5748lj0;
        }
        g(c5748lj0, c5748lj03);
        c5748lj03.g = c5748lj0;
        c5748lj0.f = c5748lj03;
        int iMax = Math.max(c5748lj02 != null ? c5748lj02.e : 0, c5748lj04 != null ? c5748lj04.e : 0) + 1;
        c5748lj0.e = iMax;
        c5748lj03.e = Math.max(iMax, c5748lj05 != null ? c5748lj05.e : 0) + 1;
    }

    public void k(C5748lj0 c5748lj0) {
        C5748lj0 c5748lj02 = (C5748lj0) c5748lj0.g;
        C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.h;
        C5748lj0 c5748lj04 = (C5748lj0) c5748lj03.g;
        C5748lj0 c5748lj05 = (C5748lj0) c5748lj03.h;
        c5748lj0.h = c5748lj04;
        if (c5748lj04 != null) {
            c5748lj04.f = c5748lj0;
        }
        i(c5748lj0, c5748lj03);
        c5748lj03.g = c5748lj0;
        c5748lj0.f = c5748lj03;
        int iMax = Math.max(c5748lj02 != null ? c5748lj02.e : 0, c5748lj04 != null ? c5748lj04.e : 0) + 1;
        c5748lj0.e = iMax;
        c5748lj03.e = Math.max(iMax, c5748lj05 != null ? c5748lj05.e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                C4398ij0 c4398ij0 = (C4398ij0) this.i;
                if (c4398ij0 != null) {
                    return c4398ij0;
                }
                C4398ij0 c4398ij02 = new C4398ij0(this, 1);
                this.i = c4398ij02;
                return c4398ij02;
            default:
                C5366jj0 c5366jj0 = (C5366jj0) this.i;
                if (c5366jj0 != null) {
                    return c5366jj0;
                }
                C5366jj0 c5366jj02 = new C5366jj0(this, 1);
                this.i = c5366jj02;
                return c5366jj02;
        }
    }

    public void l(C5748lj0 c5748lj0) {
        C5748lj0 c5748lj02 = (C5748lj0) c5748lj0.g;
        C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.h;
        C5748lj0 c5748lj04 = (C5748lj0) c5748lj02.g;
        C5748lj0 c5748lj05 = (C5748lj0) c5748lj02.h;
        c5748lj0.g = c5748lj05;
        if (c5748lj05 != null) {
            c5748lj05.f = c5748lj0;
        }
        g(c5748lj0, c5748lj02);
        c5748lj02.h = c5748lj0;
        c5748lj0.f = c5748lj02;
        int iMax = Math.max(c5748lj03 != null ? c5748lj03.e : 0, c5748lj05 != null ? c5748lj05.e : 0) + 1;
        c5748lj0.e = iMax;
        c5748lj02.e = Math.max(iMax, c5748lj04 != null ? c5748lj04.e : 0) + 1;
    }

    public void m(C5748lj0 c5748lj0) {
        C5748lj0 c5748lj02 = (C5748lj0) c5748lj0.g;
        C5748lj0 c5748lj03 = (C5748lj0) c5748lj0.h;
        C5748lj0 c5748lj04 = (C5748lj0) c5748lj02.g;
        C5748lj0 c5748lj05 = (C5748lj0) c5748lj02.h;
        c5748lj0.g = c5748lj05;
        if (c5748lj05 != null) {
            c5748lj05.f = c5748lj0;
        }
        i(c5748lj0, c5748lj02);
        c5748lj02.h = c5748lj0;
        c5748lj0.f = c5748lj02;
        int iMax = Math.max(c5748lj03 != null ? c5748lj03.e : 0, c5748lj05 != null ? c5748lj05.e : 0) + 1;
        c5748lj0.e = iMax;
        c5748lj02.e = Math.max(iMax, c5748lj04 != null ? c5748lj04.e : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (obj == null) {
                    throw new NullPointerException("key == null");
                }
                if (obj2 == null && !this.c) {
                    throw new NullPointerException("value == null");
                }
                C5748lj0 c5748lj0A = a(obj, true);
                Object obj3 = c5748lj0A.d;
                c5748lj0A.d = obj2;
                return obj3;
            default:
                if (obj == null) {
                    throw new NullPointerException("key == null");
                }
                if (obj2 == null && !this.c) {
                    throw new NullPointerException("value == null");
                }
                C5748lj0 c5748lj0B = b(obj, true);
                Object obj4 = c5748lj0B.d;
                c5748lj0B.d = obj2;
                return obj4;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C5748lj0 c5748lj0A;
        C5748lj0 c5748lj0B;
        switch (this.a) {
            case 0:
                if (obj != null) {
                    try {
                        c5748lj0A = a(obj, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c5748lj0A = null;
                }
                if (c5748lj0A != null) {
                    e(c5748lj0A, true);
                }
                if (c5748lj0A != null) {
                    return c5748lj0A.d;
                }
                return null;
            default:
                if (obj != null) {
                    try {
                        c5748lj0B = b(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                } else {
                    c5748lj0B = null;
                }
                if (c5748lj0B != null) {
                    f(c5748lj0B, true);
                }
                if (c5748lj0B != null) {
                    return c5748lj0B.d;
                }
                return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return this.d;
    }
}
