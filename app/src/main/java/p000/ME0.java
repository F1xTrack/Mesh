package p000;

/* loaded from: classes2.dex */
public enum ME0 implements InterfaceC10997s90 {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* renamed from: a */
    public final int f7059a;

    ME0(int i) {
        this.f7059a = i;
    }

    /* renamed from: b */
    public static ME0 m5287b(int i) {
        switch (i) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // p000.InterfaceC10997s90
    /* renamed from: a */
    public final int mo2106a() {
        return this.f7059a;
    }
}
