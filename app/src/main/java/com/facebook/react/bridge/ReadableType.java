package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p000.F02;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m22267d2 = {"Lcom/facebook/react/bridge/ReadableType;", "", "(Ljava/lang/String;I)V", "Null", "Boolean", "Number", "String", "Map", "Array", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class ReadableType extends Enum<ReadableType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReadableType[] $VALUES;
    public static final ReadableType Null = new ReadableType("Null", 0);
    public static final ReadableType Boolean = new ReadableType("Boolean", 1);
    public static final ReadableType Number = new ReadableType("Number", 2);
    public static final ReadableType String = new ReadableType("String", 3);
    public static final ReadableType Map = new ReadableType("Map", 4);
    public static final ReadableType Array = new ReadableType("Array", 5);

    private static final /* synthetic */ ReadableType[] $values() {
        return new ReadableType[]{Null, Boolean, Number, String, Map, Array};
    }

    static {
        ReadableType[] readableTypeArr$values = $values();
        $VALUES = readableTypeArr$values;
        $ENTRIES = F02.m2482c(readableTypeArr$values);
    }

    private ReadableType(String str, int i) {
        super(str, i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ReadableType valueOf(String str) {
        return (ReadableType) Enum.valueOf(ReadableType.class, str);
    }

    public static ReadableType[] values() {
        return (ReadableType[]) $VALUES.clone();
    }
}
