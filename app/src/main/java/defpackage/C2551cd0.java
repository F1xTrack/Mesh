package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: cd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2551cd0 {
    public static final LinkedHashSet a = AbstractC7627vZ0.d(C0084Av0.E("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;
    public static final LinkedHashSet g;

    static {
        List<EnumC7066sd0> listF = AbstractC8259yu.f(EnumC7066sd0.BOOLEAN, EnumC7066sd0.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC7066sd0 enumC7066sd0 : listF) {
            String strB = enumC7066sd0.e().f().b();
            O90.e(strB, "asString(...)");
            AbstractC0314Du.m(linkedHashSet, C0084Av0.D(strB, enumC7066sd0.b + "Value()" + enumC7066sd0.c()));
        }
        b = AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(linkedHashSet, C0084Av0.E("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C0084Av0.D("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C0084Av0.D("Double", "isInfinite()Z", "isNaN()Z")), C0084Av0.D("Float", "isInfinite()Z", "isNaN()Z")), C0084Av0.D("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C0084Av0.D("CharSequence", "isEmpty()Z"));
        c = C0084Av0.E("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        d = AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(AbstractC7627vZ0.c(C0084Av0.D("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C0084Av0.E("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C0084Av0.D("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C0084Av0.D("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C0084Av0.E("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C0084Av0.E("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C0084Av0.E("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        e = AbstractC7627vZ0.c(AbstractC7627vZ0.c(C0084Av0.E("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C0084Av0.E("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C0084Av0.E("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC7066sd0 enumC7066sd02 = EnumC7066sd0.BYTE;
        List listF2 = AbstractC8259yu.f(EnumC7066sd0.BOOLEAN, enumC7066sd02, EnumC7066sd0.DOUBLE, EnumC7066sd0.FLOAT, enumC7066sd02, EnumC7066sd0.INT, EnumC7066sd0.LONG, EnumC7066sd0.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listF2.iterator();
        while (it.hasNext()) {
            String strB2 = ((EnumC7066sd0) it.next()).e().f().b();
            O90.e(strB2, "asString(...)");
            String[] strArrY = C0084Av0.y("Ljava/lang/String;");
            AbstractC0314Du.m(linkedHashSet2, C0084Av0.D(strB2, (String[]) Arrays.copyOf(strArrY, strArrY.length)));
        }
        String[] strArrY2 = C0084Av0.y("D");
        LinkedHashSet linkedHashSetC = AbstractC7627vZ0.c(linkedHashSet2, C0084Av0.D("Float", (String[]) Arrays.copyOf(strArrY2, strArrY2.length)));
        String[] strArrY3 = C0084Av0.y("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = AbstractC7627vZ0.c(linkedHashSetC, C0084Av0.D("String", (String[]) Arrays.copyOf(strArrY3, strArrY3.length)));
        String[] strArrY4 = C0084Av0.y("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = C0084Av0.D("Throwable", (String[]) Arrays.copyOf(strArrY4, strArrY4.length));
    }
}
