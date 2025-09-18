package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11110t21 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f42786a;

    /* renamed from: b */
    public int f42787b = -1;

    /* renamed from: c */
    public boolean f42788c;

    /* renamed from: d */
    public Iterator f42789d;

    /* renamed from: e */
    public final /* synthetic */ AbstractMap f42790e;

    public /* synthetic */ C11110t21(AbstractMap abstractMap, int i) {
        this.f42786a = i;
        this.f42790e = abstractMap;
    }

    /* renamed from: a */
    public Iterator m24832a() {
        switch (this.f42786a) {
            case 0:
                if (this.f42789d == null) {
                    this.f42789d = ((C10214m21) this.f42790e).f37428c.entrySet().iterator();
                }
                break;
            case 1:
                if (this.f42789d == null) {
                    this.f42789d = ((C10342n21) this.f42790e).f38059c.entrySet().iterator();
                }
                break;
            default:
                if (this.f42789d == null) {
                    this.f42789d = ((C10470o21) this.f42790e).f38728c.entrySet().iterator();
                }
                break;
        }
        return this.f42789d;
    }

    /* renamed from: b */
    public Iterator m24833b() {
        if (this.f42789d == null) {
            this.f42789d = ((C10126lL1) this.f42790e).f37019c.entrySet().iterator();
        }
        return this.f42789d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f42786a) {
            case 0:
                int i = this.f42787b + 1;
                C10214m21 c10214m21 = (C10214m21) this.f42790e;
                if (i >= c10214m21.f37427b.size()) {
                    return !c10214m21.f37428c.isEmpty() && m24832a().hasNext();
                }
                return true;
            case 1:
                return this.f42787b + 1 < ((C10342n21) this.f42790e).f38058b.size() || m24832a().hasNext();
            case 2:
                int i2 = this.f42787b + 1;
                C10470o21 c10470o21 = (C10470o21) this.f42790e;
                if (i2 >= c10470o21.f38727b.size()) {
                    return !c10470o21.f38728c.isEmpty() && m24832a().hasNext();
                }
                return true;
            default:
                boolean z = true;
                int i3 = this.f42787b + 1;
                C10126lL1 c10126lL1 = (C10126lL1) this.f42790e;
                if (i3 >= c10126lL1.f37018b) {
                    if (c10126lL1.f37019c.isEmpty()) {
                        z = false;
                    } else if (!m24833b().hasNext()) {
                        return false;
                    }
                }
                return z;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f42786a) {
            case 0:
                this.f42788c = true;
                int i = this.f42787b + 1;
                this.f42787b = i;
                C10214m21 c10214m21 = (C10214m21) this.f42790e;
                return i < c10214m21.f37427b.size() ? (Map.Entry) c10214m21.f37427b.get(this.f42787b) : (Map.Entry) m24832a().next();
            case 1:
                this.f42788c = true;
                int i2 = this.f42787b + 1;
                this.f42787b = i2;
                C10342n21 c10342n21 = (C10342n21) this.f42790e;
                return i2 < c10342n21.f38058b.size() ? (Map.Entry) c10342n21.f38058b.get(this.f42787b) : (Map.Entry) m24832a().next();
            case 2:
                this.f42788c = true;
                int i3 = this.f42787b + 1;
                this.f42787b = i3;
                C10470o21 c10470o21 = (C10470o21) this.f42790e;
                return i3 < c10470o21.f38727b.size() ? (Map.Entry) c10470o21.f38727b.get(this.f42787b) : (Map.Entry) m24832a().next();
            default:
                this.f42788c = true;
                int i4 = this.f42787b + 1;
                this.f42787b = i4;
                C10126lL1 c10126lL1 = (C10126lL1) this.f42790e;
                return i4 < c10126lL1.f37018b ? (C10894rL1) c10126lL1.f37017a[i4] : (Map.Entry) m24833b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f42790e;
        switch (this.f42786a) {
            case 0:
                if (!this.f42788c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f42788c = false;
                int i = C10214m21.f37425g;
                C10214m21 c10214m21 = (C10214m21) abstractMap;
                c10214m21.m22637b();
                if (this.f42787b >= c10214m21.f37427b.size()) {
                    m24832a().remove();
                    return;
                }
                int i2 = this.f42787b;
                this.f42787b = i2 - 1;
                c10214m21.m22642g(i2);
                return;
            case 1:
                if (!this.f42788c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f42788c = false;
                int i3 = C10342n21.f38056f;
                C10342n21 c10342n21 = (C10342n21) abstractMap;
                c10342n21.m23062b();
                if (this.f42787b >= c10342n21.f38058b.size()) {
                    m24832a().remove();
                    return;
                }
                int i4 = this.f42787b;
                this.f42787b = i4 - 1;
                c10342n21.m23066f(i4);
                return;
            case 2:
                if (!this.f42788c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f42788c = false;
                int i5 = C10470o21.f38725g;
                C10470o21 c10470o21 = (C10470o21) abstractMap;
                c10470o21.m23315b();
                if (this.f42787b >= c10470o21.f38727b.size()) {
                    m24832a().remove();
                    return;
                }
                int i6 = this.f42787b;
                this.f42787b = i6 - 1;
                c10470o21.m23320g(i6);
                return;
            default:
                if (!this.f42788c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f42788c = false;
                int i7 = C10126lL1.f37016g;
                C10126lL1 c10126lL1 = (C10126lL1) abstractMap;
                c10126lL1.m22413i();
                int i8 = this.f42787b;
                if (i8 >= c10126lL1.f37018b) {
                    m24833b().remove();
                    return;
                } else {
                    this.f42787b = i8 - 1;
                    c10126lL1.m22411f(i8);
                    return;
                }
        }
    }
}
