/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thevoxelbox.voxelsniper.brush.perform;

import com.thevoxelbox.voxelsniper.vMessage;
import com.thevoxelbox.voxelsniper.vSniper;
import org.bukkit.block.Block;

/**
 *
 * @author Voxel
 */
public class pComboNoUndo extends vPerformer {

    private int i;
    private byte d;

    public pComboNoUndo() {
        name = "Combo, No-Undo"; // made name more descriptive - Giltwist
    }

    @Override
    public void init(vSniper v) {
        w = v.p.getWorld();
        i = v.voxelId;
        d = v.data;
    }

    @Override
    public void info(vMessage vm) {
        vm.performerName(name);
        vm.voxel();
        vm.data();
    }

    @Override
    public void perform(Block b) {
        if(b.getTypeId() != i || b.getData() != d) {
            b.setTypeIdAndData(i, d, true);
        }
    }
}