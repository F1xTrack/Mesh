package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class P32 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ P32(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString = null;
                String strCreateString2 = null;
                String strCreateString3 = null;
                String strCreateString4 = null;
                String strCreateString5 = null;
                String strCreateString6 = null;
                String strCreateString7 = null;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header)) {
                        case 1:
                            strCreateString = SafeParcelReader.createString(parcel, header);
                            break;
                        case 2:
                            strCreateString2 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 3:
                            strCreateString3 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 4:
                            strCreateString4 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 5:
                            strCreateString5 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 6:
                            strCreateString6 = SafeParcelReader.createString(parcel, header);
                            break;
                        case 7:
                            strCreateString7 = SafeParcelReader.createString(parcel, header);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new D32(strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, strCreateString7);
            case 1:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString8 = null;
                int i = 0;
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header2);
                    if (fieldId == 1) {
                        i = SafeParcelReader.readInt(parcel, header2);
                    } else if (fieldId != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header2);
                    } else {
                        strCreateString8 = SafeParcelReader.createString(parcel, header2);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new E32(i, strCreateString8);
            case 2:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString9 = null;
                String strCreateString10 = null;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header3);
                    if (fieldId2 == 1) {
                        strCreateString9 = SafeParcelReader.createString(parcel, header3);
                    } else if (fieldId2 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header3);
                    } else {
                        strCreateString10 = SafeParcelReader.createString(parcel, header3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                return new F32(strCreateString9, strCreateString10);
            case 3:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString11 = null;
                String strCreateString12 = null;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header4);
                    if (fieldId3 == 1) {
                        strCreateString11 = SafeParcelReader.createString(parcel, header4);
                    } else if (fieldId3 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header4);
                    } else {
                        strCreateString12 = SafeParcelReader.createString(parcel, header4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new G32(strCreateString11, strCreateString12);
            case 4:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                int i2 = 0;
                String strCreateString13 = null;
                String strCreateString14 = null;
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header5);
                    if (fieldId4 == 1) {
                        strCreateString13 = SafeParcelReader.createString(parcel, header5);
                    } else if (fieldId4 == 2) {
                        strCreateString14 = SafeParcelReader.createString(parcel, header5);
                    } else if (fieldId4 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header5);
                    } else {
                        i2 = SafeParcelReader.readInt(parcel, header5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new I32(strCreateString13, strCreateString14, i2);
            case 5:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header6);
                    if (fieldId5 == 1) {
                        i3 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 == 2) {
                        i4 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 == 3) {
                        i5 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 == 4) {
                        i6 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header6);
                    } else {
                        j = SafeParcelReader.readLong(parcel, header6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new Q32(i3, i4, j, i5, i6);
            default:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString15 = null;
                String strCreateString16 = null;
                String strCreateString17 = null;
                String strCreateString18 = null;
                String strCreateString19 = null;
                String strCreateString20 = null;
                String strCreateString21 = null;
                String strCreateString22 = null;
                String strCreateString23 = null;
                String strCreateString24 = null;
                String strCreateString25 = null;
                String strCreateString26 = null;
                String strCreateString27 = null;
                String strCreateString28 = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header7)) {
                        case 2:
                            strCreateString15 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 3:
                            strCreateString16 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 4:
                            strCreateString17 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 5:
                            strCreateString18 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 6:
                            strCreateString19 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 7:
                            strCreateString20 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 8:
                            strCreateString21 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 9:
                            strCreateString22 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 10:
                            strCreateString23 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 11:
                            strCreateString24 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 12:
                            strCreateString25 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 13:
                            strCreateString26 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 14:
                            strCreateString27 = SafeParcelReader.createString(parcel, header7);
                            break;
                        case 15:
                            strCreateString28 = SafeParcelReader.createString(parcel, header7);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header7);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                NU1 nu1 = new NU1();
                nu1.a = strCreateString15;
                nu1.b = strCreateString16;
                nu1.c = strCreateString17;
                nu1.d = strCreateString18;
                nu1.e = strCreateString19;
                nu1.f = strCreateString20;
                nu1.g = strCreateString21;
                nu1.h = strCreateString22;
                nu1.i = strCreateString23;
                nu1.j = strCreateString24;
                nu1.k = strCreateString25;
                nu1.l = strCreateString26;
                nu1.m = strCreateString27;
                nu1.n = strCreateString28;
                return nu1;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new D32[i];
            case 1:
                return new E32[i];
            case 2:
                return new F32[i];
            case 3:
                return new G32[i];
            case 4:
                return new I32[i];
            case 5:
                return new Q32[i];
            default:
                return new NU1[i];
        }
    }
}
