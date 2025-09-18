package defpackage;

import com.horcrux.svg.SVGLength$UnitType;

/* renamed from: Pl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1224Pl1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SVGLength$UnitType.values().length];
        a = iArr;
        try {
            iArr[SVGLength$UnitType.EMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SVGLength$UnitType.EXS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SVGLength$UnitType.CM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[SVGLength$UnitType.MM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[SVGLength$UnitType.IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[SVGLength$UnitType.PT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[SVGLength$UnitType.PC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
