package com.shopkeyboard.Keyboard;



import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_keyboard")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KeyBoard {
    @Id
    @Column(name = "keyboard_id", nullable = false)
    private String KeyBoardId;

    @Column(name = "keyboard_name", nullable = false)
    private String KeyBoardName;

    @Column(name = "keyboard_brand", nullable = false)
    private String KeyBoarBrand;

    @Column(name = "keyboard_detail", nullable = false)
    private String KeyBoardDetail;

    @Column(name = "keyboard_price", nullable = false)
    private double KeyBoardPrice;

    @Column(name = "keyboard_image", nullable = false)
    private String KeyBoardImage;
}
