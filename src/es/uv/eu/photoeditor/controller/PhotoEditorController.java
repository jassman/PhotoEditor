/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.photoeditor.controller;

import es.uv.eu.photoeditor.model.PhotoEditorModel;
import es.uv.eu.photoeditor.view.PhotoEditorView;

/**
 *
 * @author Javier
 */
public class PhotoEditorController {
    
    private PhotoEditorModel model;
    private PhotoEditorView view;
    
    public PhotoEditorController(PhotoEditorModel model, PhotoEditorView view){
        this.model = model;
        this.view = view;
    }
    
}
