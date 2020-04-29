package edu.tcu.cs.hogwartsartifactsonline.controller;

import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.domain.Result;
import edu.tcu.cs.hogwartsartifactsonline.domain.StatusCode;
import edu.tcu.cs.hogwartsartifactsonline.service.ArtifactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtifactController {

    private ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @GetMapping("/artifacts")
    public Result findAll() {
        List<Artifact> all = artifactService.findAll();
        Result result = new Result(true, StatusCode.SUCCESS, "Find All Success", all);
        return result;
    }

    @GetMapping("/artifacts/{artifactId}")
    public Result findById(@PathVariable String artifactId) {
        artifactService.findById(artifactId);
        return new Result(true, StatusCode.SUCCESS, "Find one success", (List<Artifact>) artifactService.findById(artifactId));
    }

    @PostMapping("/artifacts")
    public Result save(@RequestBody Artifact newArtifact) {
        artifactService.save(newArtifact);
        return new Result(true, StatusCode.SUCCESS, "save success");
    }

    @PutMapping("/artifacts/{artifactId}")
    public Result update(@PathVariable String artifactId, @RequestBody Artifact updatedArtifact) {
        artifactService.update(artifactId, updatedArtifact);
        return new Result(true, StatusCode.SUCCESS, "update success");
    }

    @DeleteMapping("/artifacts/{artifactId}")
    public Result delete(@PathVariable String artifactId) {
        artifactService.delete(artifactId);
        return new Result(true, StatusCode.SUCCESS, "delete success");
    }
}
