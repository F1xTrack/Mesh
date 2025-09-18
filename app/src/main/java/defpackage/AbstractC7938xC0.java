package defpackage;

import java.util.LinkedHashMap;

/* renamed from: xC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7938xC0 {
    public static final C0258Db0 a = new C0258Db0(EnumC0321Dw0.b, false);
    public static final C0258Db0 b;
    public static final C0258Db0 c;
    public static final LinkedHashMap d;

    static {
        EnumC0321Dw0 enumC0321Dw0 = EnumC0321Dw0.c;
        b = new C0258Db0(enumC0321Dw0, false);
        c = new C0258Db0(enumC0321Dw0, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C0542Gs c0542Gs = new C0542Gs();
        c0542Gs.a = new LinkedHashMap();
        new C3383dO1(c0542Gs, "java/util/".concat("Iterator")).x("forEachRemaining", new C7558vC0(strConcat4, 0));
        new C3383dO1(c0542Gs, "java/lang/".concat("Iterable")).x("spliterator", new C1404Rt1(1, 14));
        C3383dO1 c3383dO1 = new C3383dO1(c0542Gs, "java/util/".concat("Collection"));
        c3383dO1.x("removeIf", new C7558vC0(strConcat2, 6));
        c3383dO1.x("stream", new C7558vC0(strConcat8, 7));
        c3383dO1.x("parallelStream", new C7558vC0(strConcat8, 8));
        new C3383dO1(c0542Gs, "java/util/".concat("List")).x("replaceAll", new C7558vC0(strConcat7, 9));
        C3383dO1 c3383dO12 = new C3383dO1(c0542Gs, "java/util/".concat("Map"));
        c3383dO12.x("forEach", new C7558vC0(strConcat6, 10));
        c3383dO12.x("putIfAbsent", new C7558vC0(strConcat, 11));
        c3383dO12.x("replace", new C7558vC0(strConcat, 12));
        c3383dO12.x("replace", new C7558vC0(strConcat, 13));
        c3383dO12.x("replaceAll", new C7558vC0(strConcat5, 14));
        c3383dO12.x("compute", new C7748wC0(strConcat, strConcat5, 0));
        c3383dO12.x("computeIfAbsent", new C7748wC0(strConcat, strConcat3, 1));
        c3383dO12.x("computeIfPresent", new C7748wC0(strConcat, strConcat5, 2));
        c3383dO12.x("merge", new C7748wC0(strConcat, strConcat5, 3));
        C3383dO1 c3383dO13 = new C3383dO1(c0542Gs, strConcat9);
        c3383dO13.x("empty", new C7558vC0(strConcat9, 15));
        c3383dO13.x("of", new C7748wC0(strConcat, strConcat9, 4));
        c3383dO13.x("ofNullable", new C7748wC0(strConcat, strConcat9, 5));
        c3383dO13.x("get", new C7558vC0(strConcat, 16));
        c3383dO13.x("ifPresent", new C7558vC0(strConcat4, 17));
        new C3383dO1(c0542Gs, "java/lang/".concat("ref/Reference")).x("get", new C7558vC0(strConcat, 18));
        new C3383dO1(c0542Gs, strConcat2).x("test", new C7558vC0(strConcat, 19));
        new C3383dO1(c0542Gs, "java/util/function/".concat("BiPredicate")).x("test", new C7558vC0(strConcat, 20));
        new C3383dO1(c0542Gs, strConcat4).x("accept", new C7558vC0(strConcat, 1));
        new C3383dO1(c0542Gs, strConcat6).x("accept", new C7558vC0(strConcat, 2));
        new C3383dO1(c0542Gs, strConcat3).x("apply", new C7558vC0(strConcat, 3));
        new C3383dO1(c0542Gs, strConcat5).x("apply", new C7558vC0(strConcat, 4));
        new C3383dO1(c0542Gs, "java/util/function/".concat("Supplier")).x("get", new C7558vC0(strConcat, 5));
        d = c0542Gs.a;
    }
}
